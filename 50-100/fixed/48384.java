private void flikker() {
    if ((millisTillGone) < 3000) {
        this.drawBlock = (((millisTillGone) / 1000) % 2) == 0;
    }else {
        this.drawBlock = (((millisTillGone) / 100) % 2) == 0;
    }
}