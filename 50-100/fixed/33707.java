public void actionPerformed(java.awt.event.ActionEvent e) {
    util.window.UpdateDialog.dial = new util.window.DownloadingDialog(util.Updater.getDownloadLink());
    this.dispose();
    util.window.UpdateDialog.dial.setLocationRelativeTo(AnimeIndex.mainFrame);
    util.window.UpdateDialog.dial.setVisible(true);
    save();
    util.ExternalProgram ext = new util.ExternalProgram((((((util.FileManager.getAppDataPath()) + (java.io.File.separator)) + "Update") + (java.io.File.separator)) + (util.window.UpdateDialog.NEW_VERSION)));
    ext.run();
}