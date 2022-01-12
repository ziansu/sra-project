@java.lang.Override
public void onBindViewHolder(com.thetidbitapp.adap.EventAdapter.EventViewHolder holder, int position) {
    holder.ivCover.setImageBitmap(android.graphics.BitmapFactory.decodeResource(mContext.getResources(), R.drawable.test_picture_2));
    holder.tvTitle.setText(mEvents.get(position).eventName());
    holder.tvLoc.setText(mEvents.get(position).location());
    holder.tvDate.setText(mEvents.get(position).datetime());
    setInAnimation(holder.cv, position);
}