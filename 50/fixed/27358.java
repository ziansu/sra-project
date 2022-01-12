public static boolean isDisabled(final org.jenkins.ci.plugins.keyboard_shortcuts.KeyboardShortcutsUserProperty property) {
    if (property == null) {
        return KeyboardShortcutsUserProperty.DEFAULT_DISABLED;
    }
    return property.isDisabled();
}