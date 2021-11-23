public static java.lang.String parseSptRig(java.lang.String dirPath, com.teamshi.collectionsystem3.datastructure.SPTRig sptRig, android.content.res.AssetManager assetManager) {
    if (sptRig == null) {
        return null;
    }
    java.lang.String[][] sptEventArray = convertSpt(sptRig, 1, "<br/>");
    java.lang.String path = dirPath + "sptRigEvent.html";
    try {
        com.teamshi.collectionsystem3.parser.HtmlParser.write(path, sptEventArray, assetManager.open(com.teamshi.collectionsystem3.parser.HtmlParser.SPT_RIG_EVENT_TEMPLATE));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
    return path;
}