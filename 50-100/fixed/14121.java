public static org.json.JSONObject getAudioBookAsJson(model.daoModels.AudioBook model) throws org.json.JSONException {
    org.json.JSONObject jsonModel = new org.json.JSONObject();
    if (model != null) {
        jsonModel.put(model.parsers.AudioBookParser.CONTRIBUTORS_JSON_KEY, model.getContributors());
        jsonModel.put(model.parsers.AudioBookParser.REVISION_JSON_KEY, model.getRevision());
        jsonModel.put(model.parsers.AudioBookParser.TEXT_VERSION_JSON_KEY, model.getTextVersion());
        jsonModel.put(model.parsers.AudioBookParser.SOURCE_LIST_JSON_KEY, model.parsers.AudioChapterParser.getBooksJsonForVersion(model));
    }
    return jsonModel;
}