public za.org.grassroot.webapp.controller.ussd.menus.USSDMenu askForGroupNoInlineNew(za.org.grassroot.core.domain.User user, za.org.grassroot.webapp.enums.USSDSection section, java.lang.String menuIfExisting) throws java.net.URISyntaxException {
    final java.lang.String promptIfExisting = getMessage(section, za.org.grassroot.webapp.util.USSDGroupUtil.groupKeyForMessages, promptKey, user);
    final java.lang.String promptIfEmpty = getMessage(section, za.org.grassroot.webapp.util.USSDGroupUtil.groupKeyForMessages, ((promptKey) + ".empty"), user);
    final java.lang.String urlIfEmpty = (USSDSection.GROUP_MANAGER.toPath()) + "create";
    return askForGroupNoInlineNew(user, section, promptIfExisting, promptIfEmpty, menuIfExisting, urlIfEmpty, "", false);
}