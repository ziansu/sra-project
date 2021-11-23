public org.json.JSONObject getChapter(com.door43.translationstudio.core.SourceTranslation translation, java.lang.String chapterId) {
    java.lang.String md5hash = readSourceLink(translation);
    if (md5hash == null) {
        return null;
    }
    return readJSON(((((((mDataPath) + "/") + md5hash) + "/") + chapterId) + "/chapter.json"));
}