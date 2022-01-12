@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((this.mdP) != null) {
        this.currentP = this.mdP.getCurrentPosition();
    }else {
        this.currentP = 0;
    }
}