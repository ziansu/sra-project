public void visit(Expression.Apply node) {
    node.getArgument().accept(this);
    node.getFunction().accept(this);
    commands.add(Command.APPLY);
}