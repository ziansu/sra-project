public void download(java.lang.String fname) {
    try {
        java.lang.System.out.println(("Downloading " + fname));
        client.downloadFile(fname);
        files.updateDownloads(client.getDownloads());
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error downloading file", "Download", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}