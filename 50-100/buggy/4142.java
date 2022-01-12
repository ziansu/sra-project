private java.lang.String generateFilename(java.lang.String number) {
    java.lang.String timestamp = DATE_FORMAT.format(new java.util.Date());
    if (android.text.TextUtils.isEmpty(number)) {
        number = "unknown";
    }
    return ((number + "_") + timestamp) + ".amr";
    int audioFormat = getAudioFormat();
    if (audioFormat == (MediaRecorder.OutputFormat.AMR_NB)) {
        return ((number + "_") + timestamp) + ".amr";
    }else {
        return ((number + "_") + timestamp) + ".m4a ";
    }
}