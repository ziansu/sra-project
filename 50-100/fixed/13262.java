private void showTaskbar() {
    startButton.setVisibility(View.VISIBLE);
    space.setVisibility(View.VISIBLE);
    if (isShowingRecents) {
        if ((taskbar.getVisibility()) == (android.view.View.GONE))
            taskbar.setVisibility(View.INVISIBLE);
        
        divider.setVisibility(View.VISIBLE);
    }
    shouldRefreshRecents = true;
    startRefreshingRecents();
    android.content.SharedPreferences pref = com.farmerbb.taskbar.util.U.getSharedPreferences(this);
    pref.edit().putBoolean("collapsed", true).apply();
    updateButton(false);
}