public static void checkOrcid(java.lang.String orcid) throws eu.transkribus.core.exceptions.InvalidUserInputException {
    if (((orcid != null) && (!(orcid.isEmpty()))) && (!(java.util.regex.Pattern.matches(eu.transkribus.core.util.UserInputChecker.ORCID_PATTERN, orcid)))) {
        eu.transkribus.core.util.UserInputChecker.logger.debug(("ORCID does not match pattern: " + orcid));
        throw new eu.transkribus.core.exceptions.InvalidUserInputException("ORCID is not valid!");
    }
}