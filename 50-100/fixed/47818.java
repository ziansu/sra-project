public void updateInternalStorage() {
    java.util.ArrayList<Task> _taskList = new java.util.ArrayList<Task>();
    java.util.ArrayList<java.lang.String> entriesList = _storage.readFromFile();
    if (entriesList == null) {
        return ;
    }
    for (java.lang.String entry : entriesList) {
        _taskList.add(new Task(entry));
    }
}