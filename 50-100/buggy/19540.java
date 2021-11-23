public static boolean messageAcceuil() {
    java.lang.String[] options = new java.lang.String[]{ "GUI" , "Console" };
    java.lang.String message = source.challenge.LSD.getString("mesAc_msg");
    java.lang.String choix = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(null, message, "IMPORTANT", javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[0])));
    if (choix.equals(options[0])) {
        return true;
    }else {
        return false;
    }
}