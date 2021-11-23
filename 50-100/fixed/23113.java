public java.util.List<com.example.model.Post> searchByDestination(java.lang.String name) {
    java.util.ArrayList<com.example.model.Post> searchResults = new java.util.ArrayList<>();
    for (com.example.model.Post post : allPosts.values()) {
        if (post.getDestination().contains(name)) {
            searchResults.add(post);
        }
    }
    return searchResults;
}