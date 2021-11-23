private static boolean downloadNewUpdatefile(java.lang.String http) {
    try {
        de.drk.akrd.Update.downloadFile(http, "updatedata.xml");
        return true;
    } catch (java.lang.Exception ex) {
        try {
            java.net.URL url = new java.net.URL(http);
        } catch (java.net.MalformedURLException ex1) {
            java.util.logging.Logger.getLogger(de.drk.akrd.XMLEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex1);
        }
    }
    return false;
}