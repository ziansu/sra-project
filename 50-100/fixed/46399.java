private void redoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(undos.isEmpty())) {
        customSolo = undos.pop();
        edits.push(customSolo);
        notate.pasteMelody(customSolo);
        notate.setCurrentSelectionStart(0);
        notate.delAllMelody();
        notate.pasteMelody(customSolo);
        currentSlotCS = customSolo.getSize();
    }
}