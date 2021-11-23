public static java.lang.String getPrimaryFreeGroupName(java.lang.String groupName) {
    if (groupName == null) {
        return groupName;
    }
    int index = groupName.indexOf(CarbonConstants.DOMAIN_SEPARATOR);
    if (index > 0) {
        java.lang.String domain = groupName.substring(0, index);
        if (UserCoreConstants.PRIMARY_DEFAULT_DOMAIN_NAME.equals(domain)) {
            return groupName.substring((index + 1));
        }
    }
    return groupName;
}