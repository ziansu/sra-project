public java.util.List<by.dzmitry.model.entities.Word> getUnstudiedWordsForUser(java.lang.String login) {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();
    params.put("user", login);
    params.put("studied", false);
    return wordsRepository.read(params);
}