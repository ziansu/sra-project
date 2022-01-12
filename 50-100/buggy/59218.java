public org.json.simple.JSONObject getUserById(int userId) {
    for (int i = 0; i < (user.size()); i++) {
        org.json.simple.JSONObject currentUser = ((org.json.simple.JSONObject) (movies.get(i)));
        int currentId = java.lang.Integer.parseInt(currentUser.get("id").toString());
        if (currentId == userId) {
            return currentUser;
        }
    }
    return null;
}