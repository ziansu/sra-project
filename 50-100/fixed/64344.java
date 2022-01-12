public void setEnable(boolean enable) {
    if (enable) {
        graphModel.addGraphListener(this);
    }else {
        graphModel.removeGraphListener(this);
        refresh.set(false);
    }
    if (!(isAlive())) {
        start();
    }
}