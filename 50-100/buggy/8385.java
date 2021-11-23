private void loadCouponCard() {
    itemSelectCoupon = 0;
    txtTitleName.setText(getString(R.string.stores_qrcode_coupon));
    com.nct.model.CouponCategory item = coupon_category.get(0);
    showInfoCouponCard(item);
    viewPager.setAdapter(couponCardPagerAdapter);
    viewPager.setOffscreenPageLimit(coupon_category.size());
    viewPager.setCurrentItem(0);
}