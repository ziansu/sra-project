private void setViewPagerValues() {
    cardPagerAdapter = new com.midtrans.sdk.widgets.adapter.CardPagerAdapter();
    savedCardPager.setAdapter(cardPagerAdapter);
    savedCardPager.addOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {
        @java.lang.Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @java.lang.Override
        public void onPageSelected(int position) {
        }

        @java.lang.Override
        public void onPageScrollStateChanged(int state) {
        }
    });
    circlePageIndicator.setViewPager(savedCardPager);
    cardPagerAdapter.notifyDataSetChanged();
    if (creditCardList.isEmpty()) {
        backButton.setVisibility(com.midtrans.sdk.widgets.GONE);
    }
}