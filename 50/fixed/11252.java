@java.lang.Override
protected void start() {
    super.start();
    mIsPause = false;
    com.inz.action.PlayAction.getInstance().setPlayBackProgressByUser(false);
    this.camConnect();
}