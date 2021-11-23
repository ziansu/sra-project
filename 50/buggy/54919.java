@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if (outState != null) {
        outState.putInt(com.elorri.android.tieus.fragments.BoardFragment.SELECTED_KEY, mPosition);
        mAdapter.onSaveInstanceState(getContext(), outState);
    }
    super.onSaveInstanceState(outState);
}