private void spoilerMenuActionPerformed(java.awt.event.ActionEvent evt) {
    noted_prototype.Spoiler curSpoiler = new noted_prototype.Spoiler();
    curSpoiler.setVisible(true);
    noted_prototype.Noted_Screen.currentNote.addSpoiler(curSpoiler);
    UpdateNotePanel();
}