public void turnOver() {
    if ((android.os.Build.VERSION.SDK_INT) >= 16) {
        this.button.setBackground(back);
    }else {
        this.button.setBackgroundDrawable(back);
    }
    this.button.setEnabled(false);
}