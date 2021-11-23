public static com.infiniteloop.mytasks.TaskLab get() {
    if ((com.infiniteloop.mytasks.TaskLab.sTaskLab) == null) {
        com.infiniteloop.mytasks.TaskLab.sTaskLab = new com.infiniteloop.mytasks.TaskLab();
    }
    return com.infiniteloop.mytasks.TaskLab.sTaskLab;
}