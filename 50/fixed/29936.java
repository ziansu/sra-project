private void popBackIfNoSettings() {
    if ((!(hasPermissionsPreferences())) && (!(hasUsagePreferences()))) {
        if ((getActivity()) != null) {
            getActivity().finish();
        }
    }
}