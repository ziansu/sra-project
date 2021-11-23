public static void removeItem(org.mam.kch.fyreagenda.util.Task.TaskItem item) {
    java.util.ArrayList<org.mam.kch.fyreagenda.util.Task.TaskItem> list = org.mam.kch.fyreagenda.util.Task.getList(item.getTaskType().getValue());
    list.remove(item);
    org.mam.kch.fyreagenda.util.Task.updatePositions(item.getTaskType());
    item.setTaskType(org.mam.kch.fyreagenda.util.Task.TaskType.DELETED);
    org.mam.kch.fyreagenda.util.Task.ITEM_MAP.put(item.getID(), item);
    org.mam.kch.fyreagenda.util.Task.database.deleteTask(item);
}