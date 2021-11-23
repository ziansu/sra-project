private java.util.function.Consumer<java.lang.String> setSortingOrder(seedu.address.logic.parser.Prefix prefix) {
    return ( s) -> {
        sortType = prefix.toString();
        if (s.equals(SortCommand.BY_ASCENDING)) {
            isDescending = new java.lang.Boolean(false);
            return ;
        }
        if (s.equals("")) {
            isDescending = new java.lang.Boolean(false);
            return ;
        }
        if (s.equals(SortCommand.BY_DESCENDING)) {
            isDescending = new java.lang.Boolean(true);
            return ;
        }
    };
}