public void multyply() {
    tempOperator = '*';
    if ((getTempOperand()) == 0.0)
        return ;
    
    operands.add(getTempOperand());
    operators.add(tempOperator);
    voidTempOperand();
}