@java.lang.Override
public void execute(java.lang.String parameter) {
    mSearchState = true;
    mModel.searchForProduct(parameter);
    mListener.onSearchStateChanged();
}