public boolean removeFromParentList(boolean callFromGUI) {
    if (callFromGUI) {
        int response = javax.swing.JOptionPane.showConfirmDialog(null, (("Delete Field: " + (name)) + "(all data will be lost)"), "Confirm", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (response != (javax.swing.JOptionPane.YES_OPTION))
            return false;
        
    }
    boa.gui.GUI.getDBConnection().getDao(name).deleteAllObjects();
    if ((getInputImages()) != null)
        getInputImages().deleteFromDAO();
    
    return true;
}