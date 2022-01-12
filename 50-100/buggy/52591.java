private void setupViewPager(java.lang.String url) {
    com.keshavg.reddit.ViewPagerFragmentAdapter adapter = new com.keshavg.reddit.ViewPagerFragmentAdapter(getSupportFragmentManager());
    java.lang.String[] sortByList = new java.lang.String[]{ "hot" , "new" , "rising" , "controversial" , "top" };
    for (java.lang.String sortBy : sortByList) {
        adapter.addFragment(com.keshavg.reddit.PostsFragment.newInstance((((((com.keshavg.reddit.Constants.BASE_URL) + "/") + url) + "/") + sortBy)), sortBy);
    }
    viewPager.setAdapter(adapter);
    tabLayout.setupWithViewPager(viewPager);
}