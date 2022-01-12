public static boolean authenticate_user(java.lang.String user, java.lang.String password) {
    java.lang.String Authenticated = "Authenticated";
    java.lang.String result = frame.AuthorizationPanel.cl.authenticate(user, password);
    if (result.equals(Authenticated)) {
        return true;
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, result, "Update", javax.swing.JOptionPane.WARNING_MESSAGE);
        return false;
    }
}