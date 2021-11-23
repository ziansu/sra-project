private void displayFilterDialogue() {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    com.groupeighteen.unote.view.DisplayPreferencesDialogue preferencesAlert = new com.groupeighteen.unote.view.DisplayPreferencesDialogue();
    preferencesAlert.show(fragmentManager, "DISPLAY_PREFERENCES_FRAGMENT");
}