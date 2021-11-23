public java.lang.String getUserEditionButtonTooltip() {
    if (isNoRoleUserAccounts()) {
        return org.libreplan.web.I18nHelper._("You do not have permissions to go to edit user window");
    }
    return "";
}