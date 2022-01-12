public static qora.web.Profile getProfileOpt(qora.naming.Name name) {
    if (!(qora.web.Profile.isAllowedProfileName(name.getName()))) {
        return null;
    }
    qora.naming.Name nameReloaded = database.DBSet.getInstance().getNameMap().get(name.getName());
    return new qora.web.Profile(nameReloaded);
}