protected void newNumber(java.lang.String name, javax.swing.JTextField[] fields, java.util.Stack<java.lang.Double> stack) {
    if ((removeFlag(stack)) && (!(name.equals("+/-")))) {
        addStack(java.lang.Double.parseDouble(fields[0].getText()), fields, stack);
        fields[0].setText(null);
    }
}