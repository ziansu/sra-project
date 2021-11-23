public static java.lang.String trimmedLowerOrNull(java.lang.String reference) {
    return us.hawtrey.preconditions.Assure.getPossibleNullString(us.hawtrey.preconditions.Assure.trimmedLowerOrEmpty(reference));
}