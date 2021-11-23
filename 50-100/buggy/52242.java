@java.lang.Override
public void setArgs(histori.model.Account account, histori.model.SearchQuery searchQuery) {
    if (searchQuery.hasBlockedOwners()) {
        args.addAll(searchQuery.getBlockedOwnersList());
    }
    if (!(searchQuery.isAuthoritative())) {
        final histori.model.support.EntityVisibility visibility = (searchQuery.hasVisibility()) ? searchQuery.getVisibility() : histori.model.support.EntityVisibility.everyone;
        args.add(visibility.name());
    }
    for (histori.dao.search.NexusQueryTerm term : searchQuery.getTerms()) {
        term.sqlArgs(args);
    }
}