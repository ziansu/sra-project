public seedu.address.logic.autocomplete.AutoCompletePossibilities search(java.lang.String stub) {
    for (seedu.address.logic.autocomplete.AutoCompletePossibilities entryInCache : cache) {
        if (stub.equals(entryInCache.getStub())) {
            return entryInCache;
        }
    }
    return insert(new seedu.address.logic.autocomplete.AutoCompletePossibilities(stub));
}