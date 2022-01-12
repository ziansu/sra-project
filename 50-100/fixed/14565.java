@java.lang.Override
public void onBindViewHolder(com.google.android.flexbox.test.TestViewHolder holder, int position) {
    holder.mTextView.setText(java.lang.String.valueOf((position + 1)));
    holder.mTextView.setBackgroundResource(R.drawable.flex_item_background);
    holder.mTextView.setGravity(Gravity.CENTER);
    holder.mTextView.setLayoutParams(mLayoutParams.get(position));
}