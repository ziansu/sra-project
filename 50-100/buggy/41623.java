public void addToProfile(java.lang.Integer number, java.lang.String question, java.lang.String answer) {
    java.util.Map<java.lang.String, java.lang.String> response = new java.util.HashMap<>();
    response.put(question, answer);
    profile.add((number - 1), response);
}