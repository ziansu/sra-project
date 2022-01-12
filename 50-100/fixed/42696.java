@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (defaultButton)) {
        closeModal();
        getController().robPlayer(null);
    }else {
        for (int i = 0; i < (victimButtons.size()); i++) {
            if ((e.getSource()) == (victimButtons.get(i))) {
                closeModal();
                getController().robPlayer(victims[i]);
            }
        }
    }
}