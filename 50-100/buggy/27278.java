public void removeInputItem(android.view.View inputItem, boolean requestFocus) {
    int position = getViewId(inputItem);
    if (position == (com.gcode.notes.extras.values.Constants.ERROR))
        return ;
    
    boolean wasItemFocused = getEditTextFromView(inputItem).isFocused();
    decrementItemsIdAfterPosition(position);
    mContainer.removeView(inputItem);
    android.view.View previousItem = mContainer.getChildAt((position - 1));
    if ((previousItem != null) && requestFocus) {
        onRemoveItemRequestFocus(previousItem, wasItemFocused);
    }
}