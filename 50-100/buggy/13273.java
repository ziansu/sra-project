public org.json.JSONObject getQuestion(com.door43.translationstudio.core.SourceTranslation translation, java.lang.String chapterId, java.lang.String frameId, java.lang.String questionId) {
    java.lang.String md5hash = readQuestionsLink(translation);
    if (md5hash == null) {
        return null;
    }
    return readJSON((((((((((mDataPath) + "/") + md5hash) + "/") + chapterId) + "/") + frameId) + "/") + questionId));
}