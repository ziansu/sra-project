private void searchBySubreddit(java.lang.String string) {
    foundLists.clear();
    for (com.pea.jay.redditlists.model.RedditList list : fullListAL) {
        if (list.getPost().getSubreddit().contains(string)) {
            foundLists.add(list);
        }
    }
    main.setDataList(foundLists);
}