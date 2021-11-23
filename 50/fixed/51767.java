public void actionPerformed(java.awt.event.ActionEvent e) {
    currentSeene.setCaption(tfCaption.getText());
    doUploadSeene(currentSeene);
    uploadDialog.remove(gridPanel);
    uploadDialog.dispose();
}