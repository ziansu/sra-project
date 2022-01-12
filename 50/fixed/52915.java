public static boolean isUnconfirmed(udo.storage.Task task) {
    return ((task.getGroupId()) != null) && ((task.getGroupId()) > 0);
}