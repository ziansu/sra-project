public static void cancelMedia(java.lang.String mediaFilePath) {
    if ((name.kion.twipstr.backend.BackEnd.attachedMediaFiles) != null) {
        for (java.io.File f : name.kion.twipstr.backend.BackEnd.attachedMediaFiles) {
            if (f.getAbsolutePath().equals(mediaFilePath)) {
                name.kion.twipstr.backend.BackEnd.attachedMediaFiles.remove(f);
                break;
            }
        }
    }
    if (name.kion.twipstr.backend.BackEnd.attachedMediaFiles.isEmpty()) {
        name.kion.twipstr.backend.BackEnd.attachedMediaFiles = null;
    }
}