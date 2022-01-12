public boolean isCold() {
    if ((getColdWorkPermitNo().toString().compareTo("")) == 0) {
        return false;
    }else {
        return true;
    }
}