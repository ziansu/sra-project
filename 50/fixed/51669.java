public static void addLinkToList(java.lang.String link) {
    synchronized(jonas.tool.saveForOffline.GrabUtility.filesToGrab) {
        if (!(jonas.tool.saveForOffline.GrabUtility.filesToGrab.contains(link))) {
            jonas.tool.saveForOffline.GrabUtility.filesToGrab.add(link);
        }
    }
}