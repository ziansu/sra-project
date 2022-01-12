private void redoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.System.out.println("redo");
    customSolo = undos.pop();
    edits.push(customSolo);
    notate.pasteMelody(customSolo);
    notate.setCurrentSelectionStart(0);
    notate.delAllMelody();
    notate.pasteMelody(customSolo);
    currentSlotCS = customSolo.getSize();
}