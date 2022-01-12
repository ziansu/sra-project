public static java.lang.String done(int id) {
    Task doneTask = Storage.tasks.get(id);
    doneTask.setDone(true);
    Storage.tasks.put(id, doneTask);
    Storage.writeToFile();
    return java.lang.String.format(Constants.MESSAGE_UPDATED, doneTask.getId());
}