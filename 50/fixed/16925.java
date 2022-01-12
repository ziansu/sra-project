public void loadNoteSave(com.itlabs.fabnotes.save.NoteSave noteSave) {
    if (noteSave.loadControllers()) {
        loadNoteTagsInTagBar(noteSave.getTags());
        nameTextField.setText(noteSave.getName());
    }
}