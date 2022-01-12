private boolean createOurDirectory() {
    if (ext_capable) {
        ourExtDirectory = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), com.cityfreqs.cfp_recorder.AndroidWriteProcessor.OUR_DIRECTORY);
        if ((ourExtDirectory) != null) {
            if (ourExtDirectory.mkdir()) {
                log("Make ext dir.");
                return true;
            }
        }else {
            log("Create our ext directory error.");
            return false;
        }
    }else {
        log("Ext storage not available.");
    }
    return false;
}