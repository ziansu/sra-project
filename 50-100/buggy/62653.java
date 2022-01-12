@java.lang.Override
public void accept(visitor.IVisitor v) {
    v.visit(this);
    for (api.IClassField field : _decoratedClass.getFields()) {
        field.accept(v);
    }
    v.postVisit(new impl.ClassField(null, 0, null, null));
    for (api.IClassMethod method : getMethods()) {
        method.accept(v);
    }
    v.postVisit(this);
}