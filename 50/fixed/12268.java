public expression.ExprOperand set(regs.PositionRegister pReg, int j) {
    type = ExpressionElement.PREG_IDX;
    posIdx = j;
    regVal = pReg;
    return this;
}