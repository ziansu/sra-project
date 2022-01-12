public void setupViewPager(android.support.v4.view.ViewPager viewPager) {
    com.example.android.absolutmixr.AdapterViewPager pagerAdapter = new com.example.android.absolutmixr.AdapterViewPager(getSupportFragmentManager());
    pagerAdapter.addFragment(new com.example.android.absolutmixr.FragCocktails(), "Cocktails");
    pagerAdapter.addFragment(new com.example.android.absolutmixr.FragCabinet(), "Cabinet");
    pagerAdapter.addFragment(new com.example.android.absolutmixr.FragWishlist(), "Wishlist");
    pagerAdapter.addFragment(new com.example.android.absolutmixr.FragBAC(), "BAC Calc");
    viewPager.setAdapter(pagerAdapter);
}