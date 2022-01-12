public void fadeIn(int type) {
    this.type = type;
    fadeIn.setAlpha(1);
    fadeIn.setDuration(0.1F);
    addAction(fadeIn);
}