public org.json.JSONObject getWord(com.door43.translationstudio.core.SourceTranslation translation, java.lang.String termId) {
    java.lang.String md5hash = readWordsLink(translation);
    if (md5hash != null) {
        return readJSON((((((mDataPath) + "/") + md5hash) + "/") + termId));
    }
    return null;
}