@java.lang.Override
public void onSearchConditionChanged(boolean isSearchSystem, boolean isSearchUser) {
    if (passDataA != null)
        mSearchActionHelper.setAutoCompleteList(passDataA.getSearchValues(isSearchSystem, isSearchUser));
    
}