void action() {
    data.Saver.saveDocument(o_topThread, o_originalFile);
    data.Saver.saveDocument(o_topThread, getBackupFile());
    try {
        sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}