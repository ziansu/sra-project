public void visit(Expression.Apply node) {
    node.getFunction().accept(this);
    node.getArgument().accept(this);
    commands.add(Command.APPLY);
}