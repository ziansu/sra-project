public void loadNoteSave(com.itlabs.fabnotes.save.NoteSave noteSave) {
    if (noteSave.loadControllers()) {
        java.lang.System.out.println(noteSave.getModels());
        loadNoteTagsInTagBar(noteSave.getTags());
        nameTextField.setText(noteSave.getName());
    }
}