public void visit(Expression.BinaryOperation node) {
    try {
        commands.add(new Command.PushVariable(getReference(node)));
        node.getLeft().accept(this);
        commands.add(Command.APPLY);
        node.getRight().accept(this);
        commands.add(Command.APPLY);
    } catch (SymbolNotFoundException exception) {
        throw new Converter.FailedException(exception);
    }
}