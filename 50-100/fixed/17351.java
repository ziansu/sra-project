protected void transform(wyil.builders.Codes.Update code, wyil.util.AttributedCodeBlock block, wyil.builders.VcBranch branch) {
    wyil.builders.Expr result = branch.read(code.result());
    wyil.builders.Expr oldSource = branch.read(code.target());
    wyil.builders.Expr newSource = branch.havoc(code.target());
    updateHelper(code.iterator(), oldSource, newSource, result, branch, block);
}