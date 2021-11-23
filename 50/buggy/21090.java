public static java.lang.String delete(int id) {
    Task removedTask = Storage.tasks.get(id);
    Storage.tasks.remove(id);
    Storage.writeToFile();
    return java.lang.String.format(Constants.MESSAGE_DELETED, removedTask.getUserFormat());
}