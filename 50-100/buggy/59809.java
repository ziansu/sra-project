private void clearTaskDateTo(Task task) {
    if ((task.getDateTo()) != null) {
        task.setDateTo(null);
    }
    if ((task.getDeadline()) != null) {
        task.setDeadline(null);
    }
}