public void delete(int deleteIndex) {
    java.lang.String strToDelete;
    strToDelete = new java.lang.String(tasks.get((deleteIndex - 1)).toString());
    tasks.remove((deleteIndex - 1));
    java.lang.System.out.println(java.lang.String.format(com.done.logic.Logic.MESSAGE_DELETE, strToDelete));
    jsonStorage.store(tasks);
}