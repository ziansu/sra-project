public java.util.Map<com.firebase.client.Query, java.lang.String> joinPaths(com.firebase.client.Firebase path) {
    java.util.Map<com.firebase.client.Query, java.lang.String> paths = new java.util.HashMap<>();
    paths.put(path.getRoot().child("users").child(id), "user");
    return paths;
}