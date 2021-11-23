@java.lang.Override
public void visit(com.redhat.ceylon.compiler.typechecker.tree.Tree.Super that) {
    com.redhat.ceylon.compiler.typechecker.model.TypeDeclaration d = that.getTypeModel().getDeclaration();
    if (prototypeStyle) {
        if ((that.getScope()) instanceof com.redhat.ceylon.compiler.typechecker.model.ClassOrInterface) {
            self(((com.redhat.ceylon.compiler.typechecker.model.ClassOrInterface) (that.getScope())));
        }else {
            out("this");
        }
        out(".");
    }
    self(d);
}