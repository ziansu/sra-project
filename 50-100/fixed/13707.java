@java.lang.Override
protected java.util.List<T> loadList(long offset, long limit) {
    try {
        return getSearchQuery().list(offset, limit);
    } catch (java.lang.Exception e) {
        fr.openwide.core.wicket.more.model.AbstractSearchQueryDataProvider.LOGGER.error("Erreur lors de la recherche : {}", e);
        errorFlag |= true;
        return com.google.common.collect.Lists.newArrayList();
    }
}