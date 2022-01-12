public boolean remove(spoon.reflect.code.CtBlock parentBlock, spoon.reflect.code.CtStatement fixStatement, int pos) {
    spoon.reflect.code.CtStatement s = parentBlock.getStatement(pos);
    if (fixStatement.equals(s)) {
        parentBlock.getStatements().remove(pos);
        return true;
    }else {
        java.lang.System.out.println(((("\n fx: " + fixStatement) + "\n") + s));
        throw new java.lang.IllegalStateException("Undo: Not valid fix position");
    }
}