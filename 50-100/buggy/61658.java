public boolean validateArgs() {
    boolean result = true;
    boolean length = this.validateLength();
    boolean root = this.validateRoot();
    boolean keys = this.validateKeys();
    if (!length) {
        this.printMessageHelp();
        return false;
    }
    if (!root) {
        this.printErrorRoot();
        return false;
    }
    if (!keys) {
        this.printErrorKeys();
        return false;
    }
    return result;
}