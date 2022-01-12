private boolean isEmptyTask(quicklyst.Task t) {
    if (((t.getTitle().isEmpty()) && ((t.getDue()) == null)) && ((t.getNotes()) == null)) {
        return true;
    }
    if (((t.getTitle().length()) == 1) && (t.getTitle().equals("\n"))) {
        return true;
    }
    return false;
}