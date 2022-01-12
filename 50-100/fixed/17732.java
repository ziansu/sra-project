@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.os.Bundle args = getArguments();
    long[] cardIds = args.getLongArray(com.gelakinetic.mtgfam.fragments.CardViewPagerFragment.CARD_ID_ARRAY);
    int currentPosition = args.getInt(com.gelakinetic.mtgfam.fragments.CardViewPagerFragment.STARTING_CARD_POSITION);
    if ((mPagerAdapter) == null) {
        mPagerAdapter = new com.gelakinetic.mtgfam.fragments.CardViewPagerFragment.CardViewPagerAdapter(getChildFragmentManager(), cardIds);
    }
    mViewPager.setAdapter(mPagerAdapter);
    mViewPager.setCurrentItem(currentPosition);
    mViewPager.setPageTransformer(true, new com.gelakinetic.mtgfam.fragments.CardViewPagerFragment.DepthPageTransformer());
}