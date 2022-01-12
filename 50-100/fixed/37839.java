public void visit(Expression.UnaryOperation node) {
    try {
        node.getExpression().accept(this);
        commands.add(new Command.PushVariable(getReference(node)));
        commands.add(Command.APPLY);
    } catch (SymbolNotFoundException exception) {
        throw new Converter.FailedException(exception);
    }
}