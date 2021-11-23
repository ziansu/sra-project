@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.pagers_fragment, container, false);
    mPager = ((com.mothership.tvhome.widget.PagerGroup) (root.findViewById(R.id.pages_fragment)));
    mPageAdapter = new com.mothership.tvhome.app.PagesFragment.PagesAdapter(getChildFragmentManager());
    mPager.setAdapter(mPageAdapter);
    mFocusHLMgr = new com.mothership.tvhome.widget.FocusHLMgr(((android.widget.ImageView) (root.findViewById(R.id.di_focus_hl))), root.findViewById(R.id.di_focus_hl_t));
    return root;
}