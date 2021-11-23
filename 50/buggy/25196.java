@java.lang.Override
public synchronized void addPerson(seedu.address.model.activity.Activity activity) {
    activityManager.addActivity(activity);
    updateFilteredListToShowAll();
    indicateAddressBookChanged();
}