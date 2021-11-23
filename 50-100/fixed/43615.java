public void searchByColor(java.lang.String colorString) {
    foundLists.clear();
    for (com.pea.jay.redditlists.model.RedditList list : fullListAL) {
        if (list.getColorString().equals(colorString)) {
            foundLists.add(list);
        }
    }
    main.setDataList(foundLists);
}