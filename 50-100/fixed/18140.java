@java.lang.Override
public void onClick(android.view.View v) {
    loadUrl(null);
    android.support.design.widget.TabLayout.Tab tab = tabLayout.newTab().setText("about:blank").setTag("");
    tabLayout.addTab(tab);
    tab.select();
    close.setVisibility(View.VISIBLE);
}