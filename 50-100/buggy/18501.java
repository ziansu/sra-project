public java.util.List<storage.Task> write() throws java.io.IOException {
    java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(this._fileName));
    java.util.List<storage.Task> taskList = this._taskCollection.getAll(this._taskDescriptor);
    for (storage.Task task : taskList) {
        writer.write(task.encodeTaskToString());
        writer.newLine();
    }
    writer.close();
    return taskList;
}