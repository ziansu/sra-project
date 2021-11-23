@java.lang.Override
public boolean doAccept() {
    if ((getDataModel()) != null) {
        java.util.Map<java.util.UUID, xstampp.usermanagement.api.IUser> map = new java.util.HashMap<>();
        for (xstampp.astpa.usermanagement.settings.EntryResponsibilitiesPage<?> page : pages) {
            map.putAll(page.getResult());
        }
        getDataModel().getUserSystem().assignResponsibilities(map);
    }
    return true;
}