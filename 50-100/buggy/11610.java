private wyal.lang.Formula extractDeclarationInvariant(wyal.util.Declaration.Named decl, wyal.util.Tuple<wyal.util.Expr> arguments) {
    if (decl instanceof wyal.util.Declaration.Named.Type) {
        wyal.util.Declaration.Named.Type td = ((wyal.util.Declaration.Named.Type) (decl));
        return expandTypeInvariant(td, arguments.getOperand(0));
    }else {
        wyal.util.Declaration.Named.Macro md = ((wyal.util.Declaration.Named.Macro) (decl));
        return expandMacroBody(md, arguments.getOperands());
    }
}