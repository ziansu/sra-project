public boolean isLessThan(assignment.HugeInteger that) {
    if ((this.length) > (that.length)) {
        return false;
    }
    for (int i = 0; i < (this.length); i++) {
        if ((this.getNumber()[i]) > (that.getNumber()[i])) {
            return false;
        }
    }
    return true;
}