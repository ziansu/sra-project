public som.interpreter.LexicalScope.MethodScope split() {
    assert isFinalized();
    return constructSplitScope(getNextMethodScope());
}