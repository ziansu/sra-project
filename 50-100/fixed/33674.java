private void undoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(edits.isEmpty())) {
        undos.push(customSolo);
        customSolo = edits.pop();
        notate.pasteMelody(customSolo);
        notate.setCurrentSelectionStart(0);
        notate.delAllMelody();
        notate.pasteMelody(customSolo);
        currentSlotCS = customSolo.getSize();
    }
}