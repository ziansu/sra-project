public void activate() {
    if (isOpen) {
        this.level.killLorann(true);
    }else {
        this.level.killLorann(false);
    }
}