public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.buttonGroups.setChecked(false);
        displayUsers(sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.recyclerView, sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.query);
    }else
        if (!(sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.buttonGroups.isChecked())) {
            sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.buttonUsers.setChecked(true);
        }
    
}