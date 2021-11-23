public void addToProfile(java.lang.Integer number, java.lang.String question, java.lang.String answer) {
    java.util.Map<java.lang.String, java.lang.String> response = new java.util.HashMap<>();
    response.put(question, answer);
    if ((profile.size()) < number) {
        profile.add((number - 1), response);
    }else {
        profile.set((number - 1), response);
    }
}