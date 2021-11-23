private void archiveTasks(java.util.List<nl.mpcjanssen.simpletask.task.Task> tasksToArchive) {
    if (m_app.getTodoFileName().equals(m_app.getDoneFileName())) {
        nl.mpcjanssen.simpletask.util.Util.showToastShort(this, "You have the done.txt file opened.");
        return ;
    }
    getTodoList().archive(getFileStore(), m_app.getDoneFileName(), tasksToArchive, m_app.getEol());
    closeSelectionMode();
}