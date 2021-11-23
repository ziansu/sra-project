public void start() {
    if (this.runningState)
        return ;
    
    this.drawZeroZeroZero();
    if ((millisInFuture) > 0) {
        this.easyThread = new com.camnter.easycountdowntextureview.EasyCountDownTextureView.EasyThread();
        this.easyThread.startThread();
        this.easyThread.start();
        this.runningState = true;
        if ((this.easyCountDownListener) != null) {
            this.easyCountDownListener.onCountDownStart();
        }
    }else {
        this.runningState = false;
    }
}