public static SenoneDump getSenoneDump(java.net.URL audioUrl) throws java.lang.Exception {
    SenoneDump dmp = new SenoneDump(SpeechTools.getContext().getLoader());
    for (Data data : SpeechTools.getFeatures(audioUrl)) {
        if (data instanceof FloatData) {
            dmp.addFrame(data);
        }
    }
    return dmp;
}