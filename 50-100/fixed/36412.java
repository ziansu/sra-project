private void editTitle(common.TaskObject task) {
    originalTitle = task.getTitle();
    if (!(originalTitle.equals(editTitle))) {
        task.setTitle(editTitle.trim());
        logic.edit.Edit.LOGGER.log(java.util.logging.Level.INFO, "Title edited");
    }else {
        isEditTitle = false;
    }
}