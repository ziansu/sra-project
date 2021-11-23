@java.lang.Override
public synchronized void addActivity(seedu.address.model.activity.Activity activity) {
    activityManager.addActivity(activity);
    updateFilteredListToShowAll();
    indicateAddressBookChanged();
}