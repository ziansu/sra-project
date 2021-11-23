@java.lang.Override
public boolean isAtsAdmin() {
    return configurationProvider.getConfigurations().getAtsAdmins().contains(getCurrentUser());
}