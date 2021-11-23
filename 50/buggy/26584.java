public void updateEventMemoryModelWithDate(java.util.Date date, java.lang.String displayText) {
    _addItemActivity.getIntent().putExtra(AddItemActivity.NON_DEFAULT_DATE_KEY, true);
    _addItemActivity.showTimePickButton();
    _addItemActivity.setEventIntentKey(new com.david.todo.model.EventModel(date, displayText));
}