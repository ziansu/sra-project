private void init(android.content.Context context) {
    android.view.View rootView = inflate(context, R.layout.easytabs, this);
    tabs = ((android.support.design.widget.TabLayout) (rootView.findViewById(R.id.tabs)));
    pager = ((android.support.v4.view.ViewPager) (rootView.findViewById(R.id.pager)));
}