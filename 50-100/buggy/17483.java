private int enterInteger() {
    int entInt = 0;
    java.lang.String entStr = javax.swing.JOptionPane.showInputDialog("Enter an integer between 0 - 255 ");
    try {
        entInt = java.lang.Integer.parseInt(entStr);
    } catch (java.lang.NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error, input is not an integer");
        enterInteger();
    }
    if ((entInt < 0) || (entInt > 255)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error, input out of range, please input a new input");
        enterInteger();
    }else {
        return entInt;
    }
    return 255;
}