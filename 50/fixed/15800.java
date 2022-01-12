@java.lang.Override
public void updateFilteredListToShowAll() {
    filteredTaskComponents.setPredicate(new seedu.address.model.ModelManager.PredicateExpression(new seedu.address.model.ModelManager.ArchiveQualifier(true))::unsatisfies);
}