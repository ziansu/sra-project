protected void convertPropertiesToExtensions() {
    if ((configVersion) == null) {
        configVersion = 0;
    }
    if (((configVersion) <= 2) && (!(org.apache.commons.lang.StringUtils.isEmpty(triggerPhrase)))) {
        triggerPhrase = java.util.regex.Pattern.quote(triggerPhrase);
    }
    checkCommentsFile();
    checkBuildStatusMessages();
    checkCommitStatusContext();
    configVersion = 3;
}