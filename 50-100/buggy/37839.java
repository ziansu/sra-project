public void visit(Expression.UnaryOperation node) {
    try {
        commands.add(new Command.PushVariable(getReference(node)));
        node.getExpression().accept(this);
        commands.add(Command.APPLY);
    } catch (SymbolNotFoundException exception) {
        throw new Converter.FailedException(exception);
    }
}