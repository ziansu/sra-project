public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    notesAdmin.updateNote(tbNoteTitel.getText(), tbNoteSubTitel.getText(), taUpdateNoteText.getText(), timestampe, currentUser.getId(), "keine quelle", currentNotebook.getId(), currentNote.getId(), new com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void>() {
        @java.lang.Override
        public void onSuccess(java.lang.Void result) {
            de.hdm.itprojekt.noteit.client.EditNotes.this.hide();
            de.hdm.itprojekt.noteit.client.Homepage.updateNotesCellList(currentNotebook.getId());
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
        }
    });
}