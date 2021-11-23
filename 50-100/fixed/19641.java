private void jBtnDeleteTeamActionPerformed() {
    int index = jLTeams.getSelectedIndex();
    if (index != (-1)) {
        boolean delete = (yesNoDialog((("Wollen Sie das Team \"" + (jLTeamsModel.get(index))) + "\" wirklich aus dieser KO-Runde entfernen?"))) == (javax.swing.JOptionPane.YES_OPTION);
        if (delete)
            jLTeamsModel.remove(index);
        
    }else {
        message("Sie haben keine Mannschaft ausgewaehlt.");
    }
}