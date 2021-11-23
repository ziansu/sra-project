public double getFPS(int fps) {
    FPSTimer1 = java.lang.System.currentTimeMillis();
    if (((FPSTimer1) - (FPSTimer2)) >= 1000) {
        FPSTimer2 = FPSTimer1;
        this.fps = 0;
    }
    java.lang.System.out.println((fps / (((FPSTimer1) - (FPSTimer2)) / 1000)));
    return fps / (((FPSTimer1) - (FPSTimer2)) / 1000);
}