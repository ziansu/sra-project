private static void openFile() {
    try {
        java.awt.Desktop dt = java.awt.Desktop.getDesktop();
        dt.open(new java.io.File(com.springapp.mvc.model.statistics.Statistics.FILE_PATH));
        java.lang.Runtime.getRuntime().exec(("rundll32 url.dll,FileProtocolHandler " + (com.springapp.mvc.model.statistics.Statistics.FILE_PATH)));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}