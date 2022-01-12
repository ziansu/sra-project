public static int currenttimeDiff(java.util.Date timestamp) {
    java.util.Date current = new java.util.Date();
    int diff = ((int) ((current.getTime()) - (timestamp.getTime())));
    return diff / 1000;
}