jbse.val.Value[] operands(int num) throws jbse.mem.exc.InvalidNumberOfOperandsException {
    if ((num < 0) || ((this.valueStack.size()) < num)) {
        throw new jbse.mem.exc.InvalidNumberOfOperandsException();
    }
    final jbse.val.Value[] retVal = new jbse.val.Value[num];
    int i = 0;
    for (jbse.val.Value v : this.valueStack) {
        if (i >= num) {
            break;
        }
        retVal[i] = v;
        ++i;
    }
    return retVal;
}