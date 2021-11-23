public boolean close() {
    try {
        java.lang.String last2 = com.adsamcik.signalcollector.file.FileStore.loadLastAscii(file, 2);
        assert last2 != null;
        writeable = false;
        return (last2.equals("]}")) || (com.adsamcik.signalcollector.file.FileStore.saveString(file, "]}", true));
    } catch (java.io.FileNotFoundException e) {
        com.google.firebase.crash.FirebaseCrash.report(e);
        writeable = true;
        return false;
    }
}