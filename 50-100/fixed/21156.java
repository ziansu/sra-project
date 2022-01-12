public void visit(Expression.BinaryOperation node) {
    try {
        node.getRight().accept(this);
        node.getLeft().accept(this);
        commands.add(new Command.PushVariable(getReference(node)));
        commands.add(Command.APPLY);
        commands.add(Command.APPLY);
    } catch (SymbolNotFoundException exception) {
        throw new Converter.FailedException(exception);
    }
}