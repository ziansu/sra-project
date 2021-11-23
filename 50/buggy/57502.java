public static void clearAudioFile() {
    new java.io.File(org.unicef.rapidreg.service.cache.CaseFieldValueCache.AUDIO_FILE_PATH).delete();
}