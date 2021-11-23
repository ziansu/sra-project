@java.lang.Override
public void onTabSelected(me.blog.colombia2.schoolparser.TabLayout.Tab tab) {
    getSupportActionBar().setTitle(tab.getText());
    viewPager.setCurrentItem(tab.getPosition());
    tab.select();
}