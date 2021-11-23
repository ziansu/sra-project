private static java.util.Set<java.lang.String> getAffiliationsFromArgs(java.lang.String affiliationArguments) throws seedu.addressbook.data.exception.IllegalValueException {
    if (affiliationArguments.isEmpty()) {
        return java.util.Collections.emptySet();
    }
    final java.util.Collection<java.lang.String> affiliationStrings = java.util.Arrays.asList(affiliationArguments.replaceFirst(" f/", "").split(" f/"));
    return new java.util.HashSet<>(affiliationStrings);
}