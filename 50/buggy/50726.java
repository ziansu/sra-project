@java.lang.Override
public void onResume() {
    super.onResume();
    setBirthdaysList();
    setActualEventsList();
    startServiceOfNotifications();
}