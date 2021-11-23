public static void main(java.lang.String[] args) throws java.io.IOException {
    new VisionServerThread().start();
    ParseArguments.parse(args);
    new VisionProcessingThread().start();
}