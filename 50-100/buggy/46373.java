public static boolean isSilentRegion(java.lang.String label, java.lang.String regex) {
    if (regex == null)
        regex = edu.cuny.qc.speech.AuToBI.util.WordReaderUtils.DEFAULT_SILENCE_REGEX;
    
    if (((label.length()) > 0) && (!(label.matches(regex)))) {
        return false;
    }
    return true;
}