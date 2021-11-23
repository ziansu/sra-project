@java.lang.Override
public void check(VEW.Planktonica2.Model.Catagory enclosingCategory, VEW.XMLCompiler.ASTNodes.ConstructedASTree enclosingTree) {
    rule.check(enclosingCategory, enclosingTree);
    if ((seq) != null) {
        seq.check(enclosingCategory, enclosingTree);
    }
}