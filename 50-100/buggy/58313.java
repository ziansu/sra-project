private static int inputint(java.lang.String message, java.lang.String defaultAnswer) {
    int a = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog(message, defaultAnswer));
    int b = ((int) ((java.lang.Math.random()) * 100));
    int c = a - b;
    return c;
}