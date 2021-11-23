@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean(io.github.hidroh.materialistic.LazyLoadFragment.STATE_EAGER_LOAD, mEagerLoad);
}