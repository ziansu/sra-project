public void onApplyFilter() {
    org.libreplan.web.resources.search.ResourcePredicate predicate = createPredicate();
    if (predicate != null) {
        filterByPredicate(predicate);
    }else {
        showAllWorkers();
    }
}