private void nthPower(double d, javax.swing.JTextField[] fields, java.util.Stack<java.lang.Double> stack) {
    if (stack.isEmpty())
        return ;
    
    fields[0].setText(java.lang.Double.toString(java.lang.Math.pow(stack.pop(), d)));
    resetStack(fields, stack);
}