public int GetNumberOfNewCommentsInFile(int fileIndex) {
    int count = 0;
    java.util.List<gumtree.spoon.diff.operations.Operation> actions = getActions(fileIndex);
    for (gumtree.spoon.diff.operations.Operation a : actions) {
        if (a instanceof gumtree.spoon.diff.operations.InsertOperation) {
            if ((a.getNode()) != null) {
                if ((a.getNode().getComments().size()) > 0)
                    count++;
                
            }
        }
    }
    return count;
}