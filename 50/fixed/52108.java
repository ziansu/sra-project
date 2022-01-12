@java.lang.Override
public void execute(java.lang.String parameter) {
    mSearchState = true;
    mModel.searchForProduct(parameter);
    if ((mListener) != null) {
        mListener.onSearchStateChanged();
    }
}