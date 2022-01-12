public static void clearAudioFile() {
    java.io.File file = new java.io.File(org.unicef.rapidreg.service.cache.CaseFieldValueCache.AUDIO_FILE_PATH);
    file.delete();
}