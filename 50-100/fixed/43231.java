@java.lang.Override
protected android.support.v4.app.Fragment instantiateListFragment() {
    android.os.Bundle args = new android.os.Bundle();
    args.putString(ListFragment.EXTRA_FILTER, mQuery);
    if (android.text.TextUtils.isEmpty(mQuery)) {
        args.putString(ListFragment.EXTRA_ITEM_MANAGER, io.github.hidroh.materialistic.data.HackerNewsClient.class.getName());
    }else {
        args.putString(ListFragment.EXTRA_ITEM_MANAGER, io.github.hidroh.materialistic.data.AlgoliaClient.class.getName());
    }
    return android.support.v4.app.Fragment.instantiate(this, io.github.hidroh.materialistic.ListFragment.class.getName(), args);
}