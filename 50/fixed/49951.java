public void setActivateOnItemClick(boolean activateOnItemClick) {
    getListView().setChoiceMode((activateOnItemClick ? android.widget.ListView.CHOICE_MODE_SINGLE : android.widget.ListView.CHOICE_MODE_NONE));
}