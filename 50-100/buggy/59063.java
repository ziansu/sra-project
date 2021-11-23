@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    if (getActivity().getResources().getBoolean(R.bool.default_admin_settings)) {
        menu.findItem(R.id.save_admin_settings_button).setEnabled(false).setVisible(false);
        menu.findItem(R.id.delete_data_button).setEnabled(false).setVisible(false);
    }
}