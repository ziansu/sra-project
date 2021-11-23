public java.util.ArrayList<com.csahmad.moodcloud.Post> getPosts(com.csahmad.moodcloud.Profile profile, com.csahmad.moodcloud.SearchFilter filter, int from) throws java.util.concurrent.TimeoutException {
    if (filter == null)
        filter = new com.csahmad.moodcloud.SearchFilter();
    
    this.elasticSearch.setFilter(filter);
    filter.addFieldValue(new com.csahmad.moodcloud.FieldValue("posterId", profile.getId())).sortByDate();
    java.util.ArrayList<com.csahmad.moodcloud.Post> result = this.elasticSearch.getNext(from);
    this.elasticSearch.setFilter(null);
    return result;
}