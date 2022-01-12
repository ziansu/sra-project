private void assembleTaskAndSave() {
    task.setName(nameEdit.getText().toString());
    task.setDescription(descriptionEdit.getText().toString());
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