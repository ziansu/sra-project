private java.lang.String askForPassword(java.lang.String message) {
    java.lang.String ret = null;
    java.lang.String s = javax.swing.JOptionPane.showInputDialog(this, message, "Insert password", javax.swing.JOptionPane.QUESTION_MESSAGE);
    if ((s == null) || (!(s.isEmpty()))) {
        ret = s;
    }else {
        askForPassword(message);
    }
    return ret;
}