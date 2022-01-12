private void setEmptyShown(boolean shown) {
    if ((getView()) != null) {
        if ((mEmptyView) == null) {
            android.util.Log.v(fr.nihilus.recyclerfragment.RecyclerFragment.TAG, "setEmptyShown: no empty view, changing recyclerview visibility");
            mRecycler.setVisibility((shown ? android.view.View.GONE : android.view.View.VISIBLE));
            return ;
        }
        android.util.Log.v(fr.nihilus.recyclerfragment.RecyclerFragment.TAG, (("setEmptyShown() called with: shown = [" + shown) + "]"));
        mRecycler.setVisibility((shown ? android.view.View.GONE : android.view.View.VISIBLE));
        mEmptyView.setVisibility((shown ? android.view.View.VISIBLE : android.view.View.GONE));
    }
}