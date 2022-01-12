public boolean createAudio(java.lang.String MBROLA, java.lang.String PhonemeDB, java.lang.String Target, boolean Transcription) {
    try {
        java.io.File pho = createPho(Target);
        if (Transcription) {
            createTranscription(Target);
        }
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        rt.exec(new java.lang.String[]{ MBROLA , PhonemeDB , pho.getAbsolutePath() , Target }).waitFor();
        return true;
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        error = e.getMessage();
        return false;
    }
}