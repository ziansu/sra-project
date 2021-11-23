private void popBackIfNoSettings() {
    if ((!(hasPermissionsPreferences())) && (!(hasUsagePreferences()))) {
        getActivity().finish();
    }
}