@java.lang.Override
public void onSearchConditionChanged(boolean isSearchSystem, boolean isSearchUser) {
    mSearchActionHelper.setAutoCompleteList(passDataA.getSearchValues(isSearchSystem, isSearchUser));
}