@java.lang.Override
public void applyTitle(java.lang.String title, boolean favOnly, boolean showAll) {
    if (title != null) {
        setTitle(title);
        noDataLabel.setText(java.lang.String.format(getString(R.string.exercise_list_no_data), title));
    }else
        if (favOnly) {
            noDataLabel.setText(getString(R.string.exercise_list_no_fav));
        }else
            noDataLabel.setText(getString(R.string.exercise_list_no_all));
        
    
}