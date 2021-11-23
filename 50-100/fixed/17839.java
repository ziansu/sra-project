private void readItems() {
    java.io.File fileDir = getFilesDir();
    java.io.File file = new java.io.File(fileDir, "todo.txt");
    try {
        todoItems = new java.util.ArrayList<>(org.apache.commons.io.FileUtils.readLines(file));
    } catch (java.io.IOException e) {
        todoItems = new java.util.ArrayList<java.lang.String>();
    }
}