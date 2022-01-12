public static void main(java.lang.String[] args) throws java.io.IOException {
    new core.VisionServerThread().start();
    new core.VisionProcessingThread(0, Constants.TargetType.tower).start();
}