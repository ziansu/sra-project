public java.util.List<by.dzmitry.model.entities.Word> getUnstudiedWordsForUser(java.lang.String login, int size) {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();
    params.put("user", login);
    params.put("studied", false);
    return truncate(wordsRepository.read(params), 0, size);
}