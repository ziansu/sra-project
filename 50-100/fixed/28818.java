private void printProjectNameEmpty() {
    if (language.equals("GERMAN")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Es wurde kein Projektname eingegeben!", "Fehler", javax.swing.JOptionPane.ERROR_MESSAGE);
    }else
        if (language.equals("ENGLISH")) {
            javax.swing.JOptionPane.showMessageDialog(this, "No project name entered!", "Failure", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    
}