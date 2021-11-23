private boolean isOn() {
    boolean bRet = false;
    if (!(this.getStatus().equals(""))) {
        if ((this.getMatchRegexOn()) == 1) {
            bRet = this.getStatus().equals(this.getRegexStatus());
        }else {
            bRet = !(this.getStatus().equals(this.getRegexStatus()));
        }
    }
    return bRet;
}