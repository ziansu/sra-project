private boolean checkIfFirstTime() {
    if ((file.getId()) != null) {
        this.firstTime = false;
        return false;
    }else {
        return true;
    }
}