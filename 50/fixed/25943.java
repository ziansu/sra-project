private void dataBaseAdd(todolist.model.Task task) {
    try {
        dataBase.add(task);
    } catch (java.io.IOException e) {
    }
}