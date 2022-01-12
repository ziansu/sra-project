@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (inputValidated()) {
        if ((savedDocs) == false) {
            saveDocs(document.getDocId());
            refreshTable();
            enterUpdateState();
        }else {
            updateDocs(idToUpdate);
            refreshTable();
        }
    }
}