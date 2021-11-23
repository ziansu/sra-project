private auto_correct.AutoCorrectResponse sendRequest() {
    auto_correct.AutoCorrectRequest request = new auto_correct.AutoCorrectRequest(sentence);
    org.json.JSONObject json = request.send();
    if (json == null) {
        return null;
    }
    auto_correct.AutoCorrectResponse response = new auto_correct.AutoCorrectResponse(json);
    return response;
}