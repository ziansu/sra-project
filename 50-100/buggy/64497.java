public void onClick(android.view.View v) {
    mPager.setCurrentItem(2);
    ll2.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.rgb(30, 136, 229)));
    imageButton2.setImageResource(R.drawable.ic_filter_drama_white_24dp);
    textButton2.setTextColor(Color.WHITE);
    ResetLayout();
    ResetLast(ll2, imageButton2, textButton2);
}