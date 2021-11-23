@java.lang.Override
public void call(org.croudtrip.api.account.Vehicle vehicle) {
    android.widget.Toast.makeText(getActivity(), "Updated vehicle info", Toast.LENGTH_SHORT);
    timber.log.Timber.v("Updated vehicle info");
}