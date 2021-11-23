public void redrawEventListFragment(sk.henrichg.phoneprofilesplus.Event event, int newEventMode, int predefinedEventIndex) {
    sk.henrichg.phoneprofilesplus.EditorEventListFragment fragment = ((sk.henrichg.phoneprofilesplus.EditorEventListFragment) (getFragmentManager().findFragmentById(R.id.editor_list_container)));
    if (fragment != null) {
        fragment.dataWrapper.updateEvent(event);
        boolean newEvent = (newEventMode == (EditorEventListFragment.EDIT_MODE_INSERT)) || (newEventMode == (EditorEventListFragment.EDIT_MODE_DUPLICATE));
        fragment.updateListView(event, newEvent, false);
    }
    redrawEventPreferences(event, newEventMode, predefinedEventIndex);
}