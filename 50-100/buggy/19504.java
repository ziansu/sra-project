public void printNotesWithOneOrMoreMentions(java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> mapType, boolean showKey, boolean showValue) {
    for (java.lang.String key : mapType.keySet()) {
        if (showKey) {
            java.lang.System.out.println((("\nKEY: " + key) + "\n"));
        }
        if (showValue) {
            iterateLists(mapType, key);
        }
    }
}