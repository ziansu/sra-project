public static void main(java.lang.String[] args) {
    java.io.File appDirectory = new java.io.File("src/main/resources");
    org.cy3sabiork.ResourceExtractor.setAppDirectory(appDirectory);
    java.lang.System.out.println(appDirectory.getAbsolutePath());
    org.cy3sabiork.gui.WebViewSwing.launch(null, null, null);
}