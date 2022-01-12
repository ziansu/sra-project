public void typeSetter() {
    int rannum = randomNumber();
    java.lang.String typeset = parseRandomNumber(rannum);
    if (typeset.equals(null)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Something went wrong. Typset is null.");
    }
    typeparameter.equals(typeset);
    java.lang.System.out.println((("Item is a " + typeset) + "."));
}