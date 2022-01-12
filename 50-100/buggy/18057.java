public static boolean processString(java.lang.String message, java.lang.String[] keywords) {
    android.util.Log.i(org.addhen.smssync.util.Util.CLASS_TAG, ("processString(): find words in a string: " + message));
    java.util.Scanner scanner = new java.util.Scanner(message);
    while (scanner.hasNext()) {
        for (java.lang.String keyword : keywords) {
            if (scanner.nextLine().contentEquals(keyword)) {
                return true;
            }else {
                return false;
            }
        }
    } 
    return false;
}