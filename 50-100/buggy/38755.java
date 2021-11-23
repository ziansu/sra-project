@java.lang.Override
protected com.learning.bovquier.githubreporeader.repositories.list.FilterResults performFiltering(java.lang.CharSequence charSequence) {
    java.util.List<com.learning.bovquier.githubreporeader.datamodels.Repository> filtered = null;
    if ((charSequence.length()) == 0) {
        filtered = originalList;
    }else {
        filtered = getFilteredItems(charSequence.toString().toLowerCase());
    }
    com.learning.bovquier.githubreporeader.repositories.list.FilterResults result = new com.learning.bovquier.githubreporeader.repositories.list.FilterResults();
    result.values = filtered;
    return result;
}