private void setListenersAndListViews(com.tonykazanjian.codenamescompanion.LinearLayoutAbsListView[] linearLayoutAbsListViews, com.tonykazanjian.codenamescompanion.main.GamePresenter gamePresenter, android.widget.ListView[] listViews) {
    for (int i = 0; i < (linearLayoutAbsListViews.length); i++) {
        linearLayoutAbsListViews[i].setOnDragListener(new com.tonykazanjian.codenamescompanion.listeners.ViewDragListener(gamePresenter, this));
        linearLayoutAbsListViews[i].setAbsListView(listViews[i]);
    }
}