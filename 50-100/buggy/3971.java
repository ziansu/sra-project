public void onClick(android.content.DialogInterface dialog, int id) {
    if (postApp.ActivitiesView.MenuView.FragmentViews.PreferencesView.SettingsView.hasPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)) {
        presenter.BusByLoc();
    }else {
        perm = "bus";
        android.support.v13.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, 1);
    }
}