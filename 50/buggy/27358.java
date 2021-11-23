public static boolean isDisabled(final org.jenkins.ci.plugins.keyboard_shortcuts.KeyboardShortcutsUserProperty property) {
    org.jenkins.ci.plugins.keyboard_shortcuts.KeyboardShortcutsPageDecorator.LOG.info((("isDisabled(property=" + property) + ")"));
    if (property == null) {
        return KeyboardShortcutsUserProperty.DEFAULT_DISABLED;
    }
    return property.isDisabled();
}