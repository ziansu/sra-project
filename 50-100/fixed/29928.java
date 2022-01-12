jbse.val.Value[] operands(int num) throws jbse.mem.exc.InvalidNumberOfOperandsException {
    if ((num < 0) || ((this.valueStack.size()) < num)) {
        throw new jbse.mem.exc.InvalidNumberOfOperandsException();
    }
    final jbse.val.Value[] retVal = new jbse.val.Value[num];
    int i = num - 1;
    for (jbse.val.Value v : this.valueStack) {
        if (i < 0) {
            break;
        }
        retVal[i] = v;
        --i;
    }
    return retVal;
}