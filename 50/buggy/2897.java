public static boolean isValidRemark(java.lang.String test) {
    return test.matches(seedu.address.model.person.Remark.REMARK_VALIDATION_REGEX);
}