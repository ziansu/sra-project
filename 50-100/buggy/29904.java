@java.lang.Override
public void execute(name.webdizz.sonar.grammar.issue.tracking.Context context) {
    java.lang.String word = getMistakeWord(context.issue().message(), PluginParameter.ERROR_DESCRIPTION);
    name.webdizz.sonar.grammar.issue.tracking.LinkFunction.LOGGER.info(("try to write:" + word));
    org.sonar.api.config.Settings settings = context.projectSettings();
    java.lang.String dict = org.apache.commons.lang.StringUtils.stripToEmpty(settings.getString(PluginParameter.MANUAL_DICT));
    saveProperties(((dict + ",") + word), PluginParameter.MANUAL_DICT, context);
}