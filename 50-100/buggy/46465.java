public boolean close(@android.support.annotation.NonNull
android.content.Context context) {
    try {
        java.lang.String last2 = com.adsamcik.signalcollector.file.FileStore.loadLastAscii(file, 2);
        assert last2 != null;
        if (!(last2.equals("]}")))
            com.adsamcik.signalcollector.file.FileStore.saveString(file, "]}", true);
        
        writeable = false;
        return true;
    } catch (java.io.FileNotFoundException e) {
        com.google.firebase.crash.FirebaseCrash.report(e);
        return false;
    }
}