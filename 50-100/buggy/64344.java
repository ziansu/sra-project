public void setEnable(boolean enable) {
    java.lang.System.out.println(("setEnable" + enable));
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