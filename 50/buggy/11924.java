@java.lang.Override
public java.lang.String getDevAppserverLogLevel() {
    if (com.intellij.openapi.util.text.StringUtil.isEmpty(settings.getDevAppserverLogLevel())) {
        return "info";
    }
    return settings.getDevAppserverLogLevel();
}