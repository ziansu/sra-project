@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    android.util.Log.d(ca.rmen.android.poetassistant.main.dictionaries.ResultListFragment.TAG, (((((mTab) + ": onSaveInstanceState() called with: ") + "outState = [") + outState) + "]"));
    outState.putString(ca.rmen.android.poetassistant.main.dictionaries.ResultListFragment.EXTRA_QUERY, mBinding.tvListHeader.getText().toString());
    outState.putString(ca.rmen.android.poetassistant.main.dictionaries.ResultListFragment.EXTRA_FILTER, mBinding.tvFilter.getText().toString());
}