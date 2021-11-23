public boolean validateArgs() {
    boolean result = true;
    boolean length = this.validateLength();
    if (!length) {
        this.printMessageHelp();
        return false;
    }
    boolean root = this.validateRoot();
    boolean keys = this.validateKeys();
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