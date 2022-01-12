@java.lang.Override
protected void onResume() {
    super.onResume();
    presenter.loadContacts(jsonInformation);
    notifyAdapterAboutChanged();
    if (!(users.isEmpty())) {
        currentUser = users.get(0);
    }
}