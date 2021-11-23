public static boolean processString(java.lang.String message, java.lang.String[] keywords) {
    android.util.Log.i(org.addhen.smssync.util.Util.CLASS_TAG, ("processString(): find words in a string: " + message));
    for (int i = 0; i < (keywords.length); i++) {
        if (message.contains(keywords[i])) {
            return true;
        }
    }
    return false;
}