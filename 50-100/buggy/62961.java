public static synchronized java.lang.String getContent(java.lang.String lang, java.lang.String content) {
    java.lang.String[] contents = content.split("\n");
    content = "";
    for (java.lang.String c : contents) {
        content += (um.nija123098.inquisitor.util.LangHelper.getSingleContent(lang, c)) + "\n";
    }
    return content;
}