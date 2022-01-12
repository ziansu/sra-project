private void setupGridView(com.tonykazanjian.codenamescompanion.LinearLayoutAbsListView gridPanel, com.tonykazanjian.codenamescompanion.main.GamePresenter gamePresenter, android.widget.GridView gridView) {
    gridPanel.setOnDragListener(new com.tonykazanjian.codenamescompanion.listeners.ViewDragListener(gamePresenter, this));
    gridPanel.setAbsListView(gridView);
    gridView.setOnItemLongClickListener(new com.tonykazanjian.codenamescompanion.listeners.GridItemLongClickListener(gamePresenter));
}