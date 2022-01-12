public void onClick(android.view.View v) {
    ResetLayout();
    ResetLast(ll1, imageButton1, textButton1);
    mPager.setCurrentItem(1);
    ll1.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.rgb(30, 136, 229)));
    imageButton1.setImageResource(R.drawable.ic_account_box_white_24dp);
    textButton1.setTextColor(Color.WHITE);
}