private void jBtnAddTeamActionPerformed() {
    java.lang.String newName = null;
    boolean cancel = false;
    while (((newName == null) || (newName.isEmpty())) && (!cancel)) {
        newName = inputDialog("Name der neuen Mannschaft:");
        if ((newName == null) || (newName.isEmpty())) {
            cancel = (yesNoDialog("Sie haben keinen validen Namen eingegeben. Wollen Sie abbrechen?")) == (javax.swing.JOptionPane.YES_OPTION);
        }
    } 
    if (!cancel)
        jLTeamsModel.addElement(newName);
    
}