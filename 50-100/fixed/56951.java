private void updateContent() {
    if ((mBadge) != null) {
        mImageView.setImageDrawable(mBadge.mIcon);
        mTextView.setText(mBadge.mText);
        mTextView.setTextColor(mBadgeTextColors);
        mTextView.setTextSize(mBadgeTextSize);
        if (android.text.TextUtils.isEmpty(mTextView.getText())) {
            mTextView.setVisibility(au.com.dardle.widget.GONE);
        }else {
            mTextView.setVisibility(au.com.dardle.widget.VISIBLE);
        }
        setSelected(mBadge.mSelected);
        setEnabled(mBadge.mEnabled);
    }
}