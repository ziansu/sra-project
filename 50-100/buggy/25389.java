@java.lang.Override
public void onClick(android.view.View v) {
    if (postApp.ActivitiesView.MenuView.FragmentViews.PreferencesView.SettingsView.hasPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)) {
        presenter.WeatherOnLoc();
    }else {
        perm = "weather";
        android.support.v13.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, 1);
    }
}