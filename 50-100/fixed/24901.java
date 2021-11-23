@java.lang.Override
public void onBindViewHolder(final com.tejunareddy.hackmit2017.bucketlist.fragment.MyBucketListItemRecyclerViewAdapter.ViewHolder holder, int position) {
    holder.mItem = mValues.get(position);
    holder.mView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if (null != (mListener)) {
                mListener.onListFragmentInteraction(holder.mItem);
            }
        }
    });
}