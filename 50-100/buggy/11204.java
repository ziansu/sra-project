@com.fasterxml.jackson.annotation.JsonCreator
public static seedu.address.commons.core.Version fromString(java.lang.String versionString) throws java.lang.IllegalArgumentException {
    java.util.regex.Matcher versionMatcher = seedu.address.commons.core.Version.VERSION_PATTERN.matcher(versionString);
    if (!(versionMatcher.find())) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(seedu.address.commons.core.Version.EXCEPTION_STRING_NOT_VERSION, versionString));
    }
    return new seedu.address.commons.core.Version(java.lang.Integer.parseInt(versionMatcher.group(1)), java.lang.Integer.parseInt(versionMatcher.group(2)), java.lang.Integer.parseInt(versionMatcher.group(3)), ((versionMatcher.group(4)) == null ? false : true));
}