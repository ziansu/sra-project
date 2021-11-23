private java.io.File openTodo() {
    java.io.File filesDir = getFilesDir();
    return new java.io.File(filesDir, "todo.txt");
}