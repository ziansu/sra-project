@java.lang.Override
public void OnNewsFeed() {
    if (thisFrag.equals("login")) {
        android.app.FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction ft = fm.beginTransaction();
        newsFeedFragment = new com.example.tiferet.rebook.Fragments.NewsFeedFragment();
        newsFeedFragment.setDelegate(this);
        ft.add(R.id.container, newsFeedFragment);
        ft.hide(loginFragment);
        ft.addToBackStack("newsFeed");
        ft.show(newsFeedFragment);
        ft.commit();
        thisFrag = "newsfeed";
        invalidateOptionsMenu();
    }
}