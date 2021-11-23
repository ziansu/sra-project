public void setSavedPageCheckComplete(boolean complete) {
    savedPageCheckComplete = complete;
    if (!(isAdded())) {
        return ;
    }
    getActivity().supportInvalidateOptionsMenu();
}