public static boolean isUnconfirmed(udo.storage.Task task) {
    return (task.getGroupId()) > 0;
}