@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.buttonUsers.setChecked(false);
        displayGroups(view, sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.recyclerView, query);
    }else
        if (!(sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.buttonUsers.isChecked())) {
            sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.buttonGroups.setChecked(true);
        }
    
}