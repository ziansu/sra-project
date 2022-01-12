private boolean isEmptyTask(quicklyst.Task t) {
    if (((t.getTitle().isEmpty()) && ((t.getDue()) == null)) && ((t.getNotes()) == null)) {
        return true;
    }
    return false;
}