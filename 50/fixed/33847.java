public static boolean isDisabled() {
    return org.jenkins.ci.plugins.keyboard_shortcuts.KeyboardShortcutsPageDecorator.isDisabled(hudson.model.User.current());
}