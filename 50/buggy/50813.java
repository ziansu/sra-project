@java.lang.Override
protected void onResume() {
    super.onResume();
    presenter.loadContacts(jsonInformation);
    notifyAdapterAboutChanged();
    currentUser = users.get(0);
}