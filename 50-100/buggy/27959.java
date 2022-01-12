private static float downloadNewUpdatefile(java.lang.String http) {
    try {
        de.drk.akrd.Update.downloadFile(http, "updatedata.xml");
    } catch (java.lang.Exception ex) {
        try {
            java.net.URL url = new java.net.URL(http);
            de.drk.akrd.UtilityBox.getInstance().displayErrorPopup("Download", (("Fehler beim Download. Die Datei kann unter\n" + url) + "\nheruntergeladen werden."));
        } catch (java.net.MalformedURLException ex1) {
            java.util.logging.Logger.getLogger(de.drk.akrd.XMLEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex1);
        }
    }
    return 0.0F;
}