@java.lang.Override
public void checkName(java.lang.String origName) throws hudson.model.Failure {
    if ((org.apache.commons.lang.StringUtils.isNotBlank(origName)) && (!(java.util.regex.Pattern.matches(jenkins.model.ProjectNamingStrategy.DEFAULT_PATTERN, origName)))) {
        throw new hudson.model.Failure(jenkins.model.Messages.Hudson_JobSinglesQuotesAreProhibited());
    }
}