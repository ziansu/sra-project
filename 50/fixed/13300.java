public void writeStatementOffset(int offset) {
    assert (statements.get(offset)) == false;
    statements.set(offset);
}