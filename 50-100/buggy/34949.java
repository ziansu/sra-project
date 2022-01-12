public int GetNumberOfNewCommentsInFile(int fileIndex) {
    int count = 0;
    java.util.List<gumtree.spoon.diff.operations.Operation> actions = getActions(fileIndex);
    for (gumtree.spoon.diff.operations.Operation a : actions) {
        if (((a.getNode()) instanceof spoon.support.reflect.code.CtCommentImpl) && (a instanceof gumtree.spoon.diff.operations.InsertOperation)) {
            if ((a.getNode().getComments().size()) > 0)
                count++;
            
        }
    }
    return count;
}