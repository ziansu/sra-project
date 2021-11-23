private void assembleTaskAndSave() {
    task.setName(nameEdit.getText().toString().trim());
    task.setDescription(descriptionEdit.getText().toString().trim());
    if ((lastSelectedTag) != null) {
        task.setTagId(lastSelectedTag.getId());
    }else {
        task.setTagId(null);
    }
    if (canComplete()) {
        saveTask();
        finishAndStartRightActivity();
    }
}