private void jBtnDeleteTeamActionPerformed() {
    int index = jLTeams.getSelectedIndex();
    if (index != (-1)) {
        boolean cancel = (yesNoDialog((("Wollen Sie das Team \"" + (jLTeamsModel.get(index))) + "\" wirklich aus dieser KO-Runde entfernen?"))) == (javax.swing.JOptionPane.YES_OPTION);
        if (!cancel)
            jLTeamsModel.remove(index);
        
        listeAktualisieren();
    }else {
        message("Sie haben keine Mannschaft ausgewaehlt.");
    }
}