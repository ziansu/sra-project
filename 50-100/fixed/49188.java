public boolean isGreaterThan(assignment.HugeInteger that) {
    if ((this.length) < (that.length)) {
        return false;
    }else
        if ((this.length) > (that.length)) {
            return true;
        }
    
    for (int i = 0; i < (this.length); i++) {
        if ((this.getNumber()[i]) < (that.getNumber()[i])) {
            return false;
        }
    }
    return false;
}