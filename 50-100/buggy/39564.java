@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.pager_fragment, container, false);
    viewPager = ((android.support.v4.view.ViewPager) (view.findViewById(R.id.view_pager)));
    java.util.ArrayList<java.lang.Integer> itemIDs = getArguments().getIntegerArrayList(com.pear.shopz.fragments.ViewPagerFragment.ITEM_IDS);
    int listID = getArguments().getInt(LISTID);
    setUpViewPager(itemIDs, listID);
    return view;
}