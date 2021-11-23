private void divide(double d, javax.swing.JTextField[] fields, java.util.Stack<java.lang.Double> stack) {
    if (emptyStack(stack))
        return ;
    
    fields[0].setText(java.lang.Double.toString(((stack.pop()) / d)));
    resetStack(fields, stack);
}