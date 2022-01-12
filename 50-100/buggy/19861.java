@java.lang.Override
public void onBindViewHolder(final com.christian.adapter.HomeAdapter.ViewHolder viewHolder, int position) {
    int adapterPosition = viewHolder.getAdapterPosition();
    android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(viewHolder.itemView.getContext(), (adapterPosition > (lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top));
    viewHolder.itemView.startAnimation(animation);
    lastPosition = adapterPosition;
    viewHolder.getTextView().setText(mDataSet[adapterPosition]);
}