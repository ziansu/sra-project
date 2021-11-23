private java.io.File openTodo() {
    java.io.File filesDir = getFilesDir();
    java.io.File todoFile = new java.io.File(filesDir, "todo.txt");
    return todoFile;
}