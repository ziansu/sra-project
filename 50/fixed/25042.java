public static boolean hasFormatUnitedNations(java.lang.String text) {
    java.lang.String lowerText = text.toLowerCase();
    return (lowerText.contains("united\nnations\n")) && (lowerText.contains("general assembly\nsecurity council"));
}