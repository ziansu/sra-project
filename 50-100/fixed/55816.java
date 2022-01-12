private void deleteMultiple(java.lang.String command) throws java.lang.Exception {
    java.util.ArrayList<java.lang.Integer> deleteIndex = myParser.getIndex(command);
    edu.emory.mathcs.backport.java.util.Collections.sort(deleteIndex);
    for (int i = (deleteIndex.size()) - 1; i >= 0; i--) {
        delete(deleteIndex.get(i));
    }
    undo.add(taskList);
}