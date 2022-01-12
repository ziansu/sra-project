public static void basicSearch(java.lang.String term) {
    java.util.HashSet<java.lang.String> filteredTerm = objects.Facade.breakup(term);
    objects.Facade.resetSearchWeights();
    java.util.List<com.google.appengine.api.datastore.Entity> posts = objects.Facade.getPosts();
    for (com.google.appengine.api.datastore.Entity post : posts) {
        objects.Facade.searchEachPostField(filteredTerm, filteredTerm, filteredTerm, filteredTerm, post);
    }
    objects.Facade.collectMatchingPosts();
    java.util.Collections.reverse(objects.Facade.searchResults);
}