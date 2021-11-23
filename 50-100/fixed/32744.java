public void searchPoems(java.lang.String search_string) {
    if ((updating) || ((activity) == null)) {
        return ;
    }
    if (!(search_string.contains(last_search_string))) {
        if (!(sent_search)) {
            activity.trackSearch(last_search_string);
            sent_search = true;
        }
    }else {
        sent_search = false;
    }
    last_search_string = search_string;
    com.almoturg.sprog.model.Poems.filter(search_string, show_only_favorites);
    activity.setStatusNumPoems(com.almoturg.sprog.model.Poems.filtered_poems.size());
    activity.adapterDatasetChanged();
}