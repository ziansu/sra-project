@java.lang.Override
public void customizeSettings(@org.jetbrains.annotations.NotNull
com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable consumer, @org.jetbrains.annotations.NotNull
com.simpleplugin.SettingsType settingsType) {
    if (settingsType == (SettingsType.SPACING_SETTINGS)) {
        consumer.showStandardOptions("SPACE_AROUND_ASSIGNMENT_OPERATORS");
        consumer.renameStandardOption("SPACE_AROUND_ASSIGNMENT_OPERATORS", "Separator");
    }else
        if (settingsType == (SettingsType.BLANK_LINES_SETTINGS)) {
            consumer.showStandardOptions("KEEP_BLANK_LINES_IN_CODE");
        }else
            if (settingsType == (SettingsType.WRAPPING_AND_BRACES_SETTINGS)) {
                consumer.showStandardOptions("KEEP_LINE_BREAKS");
            }
        
    
}