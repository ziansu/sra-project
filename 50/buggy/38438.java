public void run() {
    com.kdars.AnnoTask.DocumentAnalyzer documentAnalyzer = new com.kdars.AnnoTask.DocumentAnalyzer();
    com.kdars.AnnoTask.Server.UserListener userListener = new com.kdars.AnnoTask.Server.UserListener(documentAnalyzer);
    userListener.start();
}