public void startUpdate(javax.swing.JFrame frame) {
    if (upackage.isModmakerupdate()) {
        new com.me3tweaks.modmanager.ModMakerCompilerWindow(java.lang.Integer.toString(upackage.getMod().getModMakerCode()), com.me3tweaks.modmanager.ModMakerEntryWindow.getDefaultLanguages());
    }else {
        com.me3tweaks.modmanager.modupdater.ModUpdateWindow.DownloadTask task = new com.me3tweaks.modmanager.modupdater.ModUpdateWindow.DownloadTask(upackage);
        task.addPropertyChangeListener(this);
        task.execute();
        setLocationRelativeTo(frame);
        setVisible(true);
        new com.me3tweaks.modmanager.ModManagerWindow(false);
    }
}