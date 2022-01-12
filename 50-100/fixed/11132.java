boolean canBeMerged(final com.orientechnologies.orient.core.sql.OIndexSearchResult searchResult) {
    if ((lastField.isLong()) || (searchResult.lastField.isLong())) {
        return false;
    }
    if ((!(lastOperator.canBeMerged())) || (!(searchResult.lastOperator.canBeMerged()))) {
        return false;
    }
    return (com.orientechnologies.orient.core.sql.OIndexSearchResult.isIndexEqualityOperator(lastOperator)) || (com.orientechnologies.orient.core.sql.OIndexSearchResult.isIndexEqualityOperator(searchResult.lastOperator));
}