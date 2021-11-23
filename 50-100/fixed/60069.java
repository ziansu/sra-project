@java.lang.Override
public void accept(problem.asm.visitor.IVisitor v) {
    v.preVisit(this);
    for (problem.asm.model.IField field : this.fields.values()) {
        field.accept(v);
    }
    v.visit(this);
    for (problem.asm.model.IMethod method : this.methods.values()) {
        method.accept(v);
    }
    v.postVisit(this);
}