public expression.ExprOperand set(regs.DataRegister dReg) {
    type = ExpressionElement.DREG;
    regVal = dReg;
    return this;
}