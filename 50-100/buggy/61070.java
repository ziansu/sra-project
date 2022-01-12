@java.lang.Override
public java.lang.Void visit(org.checkerframework.stubparser.ast.body.FieldDeclaration decl, annotations.el.AElement elem) {
    for (org.checkerframework.stubparser.ast.body.VariableDeclarator v : decl.getVariables()) {
        annotations.el.AClass clazz = ((annotations.el.AClass) (elem));
        annotations.el.AField field = clazz.fields.vivify(v.toString());
        visitDecl(decl, field);
        visitType(decl.getType(), field.type);
    }
    return null;
}