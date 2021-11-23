public jlang.sema.Decl.EnumDecl create(jlang.sema.ASTContext ctx, jlang.clex.IdentifierInfo name, jlang.sema.IDeclContext context, jlang.basic.SourceLocation loc, jlang.sema.Decl.EnumDecl prevDecl) {
    jlang.sema.Decl.EnumDecl ed = new jlang.sema.Decl.EnumDecl(name, context, loc, prevDecl);
    ctx.getTypeDeclType(ed, prevDecl);
    return ed;
}