public void prev() {
    int length = this.getMorphCount();
    if (length == 0) {
        return ;
    }
    if ((this.index) > (-1)) {
        (this.index)--;
        this.timer = this.getDelay();
    }
}