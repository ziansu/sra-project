public static java.util.ArrayList<java.lang.Integer> searchTask(java.util.function.Predicate<logic.Task> p) {
    Storage.Storage.indexList.clear();
    for (int i = 0; i < (Storage.Storage.taskList.size()); i++) {
        logic.Task task = Storage.Storage.taskList.get(i);
        if (p.test(task)) {
            Storage.Storage.logger.log(java.util.logging.Level.INFO, "Stores all hits indices in the indexList");
            Storage.Storage.indexList.add(Storage.Storage.indexList.get(i));
        }
    }
    return Storage.Storage.indexList;
}