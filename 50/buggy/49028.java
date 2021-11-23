public expression.ExprOperand set(regs.PositionRegister pReg, int i) {
    if ((type) != (ExpressionElement.PREG_IDX))
        type = ExpressionElement.PREG;
    
    setRegIdx(i);
    regVal = pReg;
    return this;
}