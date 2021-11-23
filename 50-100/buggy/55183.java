private void initData() {
    {
        android.view.View view1;
        android.view.View view2;
        android.view.LayoutInflater inflater = getLayoutInflater();
        view1 = inflater.inflate(R.layout.acttivty_welcome, null);
        view2 = inflater.inflate(R.layout.activty_gohomepage, null);
        mLaunchViews.add(view1);
        mLaunchViews.add(view2);
    }
}