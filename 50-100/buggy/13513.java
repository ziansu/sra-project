@java.lang.Override
public hudson.search.SearchIndexBuilder makeSearchIndex() {
    hudson.search.SearchIndexBuilder sib = new hudson.search.SearchIndexBuilder().addAllAnnotations(this);
    sib.add(new hudson.search.CollectionSearchIndex<hudson.model.TopLevelItem>() {
        protected hudson.model.TopLevelItem get(java.lang.String key) {
            return getItem(key);
        }

        protected java.util.Collection<hudson.model.TopLevelItem> all() {
            return getItems();
        }

        @java.lang.Override
        protected java.lang.String getName(hudson.model.TopLevelItem o) {
            return o.getName();
        }
    });
    addDisplayNamesToSearchIndex(sib, getItems(false));
    return sib;
}