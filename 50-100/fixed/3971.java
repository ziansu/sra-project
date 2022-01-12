public void onClick(android.content.DialogInterface dialog, int id) {
    if (postApp.ActivitiesView.MenuView.FragmentViews.PreferencesView.SettingsView.hasPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)) {
        presenter.BusByLoc();
    }else {
        perm = "bus";
        requestPermissions(new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, 1);
    }
}