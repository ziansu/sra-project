private java.lang.String[][] deleteAll() {
    for (int i = searchResult.size(); i > 0; i--)
        delete(null, i);
    
    java.lang.String feedback = new java.lang.String("All deleted");
    undoStack.clear();
    redoStack.clear();
    return display(new java.util.ArrayList<fancy4.taskie.model.TaskieTask>(), feedback);
}