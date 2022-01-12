private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(valueTF.getText().equals(""))) {
        com.uniandes.cspsolver.SingleClue clue = new com.uniandes.cspsolver.SingleClue();
        clue.setDstVar(dstVarCB.getSelectedItem().toString());
        clue.setRelationship(relationshipCB.getSelectedItem().toString());
        clue.setValue(java.lang.Integer.parseInt(valueTF.getText()));
        cspMainFrame.addClue(clue);
        cspMainFrame.updateCluesList();
        this.setVisible(false);
    }
}