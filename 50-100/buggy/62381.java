@java.lang.Override
public void onBindViewHolder(final com.viewpagerindicator.as.library.pageview.CheeseListFragment.SimpleStringRecyclerViewAdapter.ViewHolder holder, int position) {
    holder.mBoundString = mValues.get(position);
    holder.mTextView.setText(mValues.get(position));
    holder.mView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.widget.Toast.makeText(v.getContext(), "Item Clicked!", Toast.LENGTH_SHORT).show();
        }
    });
    com.bumptech.glide.Glide.with(holder.mImageView.getContext()).load(R.mipmap.ic_launcher).fitCenter().into(holder.mImageView);
}