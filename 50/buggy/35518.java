private boolean checkIfFirstTime() {
    boolean bool = false;
    if (file.checkIfFileExist()) {
        bool = true;
        this.firstTime = false;
        return false;
    }else {
        this.firstTime = true;
        return true;
    }
}