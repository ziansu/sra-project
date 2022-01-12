private void setupView() {
    if ((au.edu.uts.redylog.redylog.DataManagers.EntryManager.getInstance().get_entries(_currentJournal).size()) > 0) {
        _tvError.setVisibility(View.INVISIBLE);
    }else {
        _tvError.setVisibility(View.VISIBLE);
    }
    _tvDescription.setText(_currentJournal.get_description());
    _tvDate.setText(au.edu.uts.redylog.redylog.Helpers.HelperMethods.formatDate(_currentJournal.get_startDate()));
}