public void connect() throws java.io.IOException {
    if (!(com.kaspersky.todo.ToDoManager.nativeConnect())) {
        throw new java.io.IOException("connect failed");
    }
}