public void startAnimation() {
    if (this.animated) {
        return ;
    }
    this.frameCount = 0;
    this.animated = true;
    java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            executeAnimationLoop();
        }
    });
    t.start();
}