@java.lang.Override
public boolean isRunable() {
    boolean runable = super.isRunable();
    runable = runable && (((_contactListType) == (sk.henrichg.phoneprofilesplus.EventPreferencesCall.CONTACT_LIST_TYPE_NOT_USE)) || (!((_contacts.isEmpty()) || (_contactGroups.isEmpty()))));
    return runable;
}