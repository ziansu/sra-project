public void freeze() {
    if (!(frozen)) {
        checkFrozen();
    }else {
        this.frozen = frozen;
    }
}