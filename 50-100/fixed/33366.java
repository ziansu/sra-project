public void onClick(android.view.View v) {
    ResetLayout();
    ResetLast(ll, imageButton, textButton);
    mPager.setCurrentItem(0);
    ll.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.rgb(30, 136, 229)));
    imageButton.setImageResource(R.drawable.ic_home_white_24dp);
    textButton.setTextColor(Color.WHITE);
}