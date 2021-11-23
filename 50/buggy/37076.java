public seedu.address.logic.autocomplete.AutoCompletePossibilities search(java.lang.String stub) {
    for (seedu.address.logic.autocomplete.AutoCompletePossibilties entryInCache : cache) {
        if (stub.equals(entryInCache.getStub())) {
            return entryInCache;
        }
    }
    insert(new seedu.address.logic.autocomplete.AutoCompletePossibilties(stub));
}