@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    if ((searchView) != null)
        savedInstanceState.putString(Constants.SavedInstanceState.Characters.LAST_ITEM_SEARCHED, java.lang.String.valueOf(searchView.getQuery()));
    
    super.onSaveInstanceState(savedInstanceState);
}