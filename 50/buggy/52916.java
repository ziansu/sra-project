@java.lang.Override
public void onResume() {
    int currentHour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY);
    if (currentHour > 21) {
        gotoGame();
    }
}