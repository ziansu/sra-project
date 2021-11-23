@java.lang.Override
public void onContactsChoosen(java.util.List<java.lang.String> checkedNumbers) {
    this.settings.setWhitelistedContactsList(checkedNumbers.toArray(new java.lang.String[1]));
}