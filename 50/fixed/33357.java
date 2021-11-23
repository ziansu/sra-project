public boolean isEnabled() {
    return !(realmService.isReadOnly(getCurrentRealm()));
}