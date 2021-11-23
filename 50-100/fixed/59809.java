private void clearTaskDateTo(Task task) {
    if ((task.getDateTo()) != null) {
        task.setDateTo(null);
    }
    if (((task.getDateTo()) == null) && ((task.getDeadline()) != null)) {
        task.setDeadline(null);
    }
    if (((task.getDateTo()) == null) && ((task.getDeadline()) == null)) {
        task.setDateTo(null);
    }
}