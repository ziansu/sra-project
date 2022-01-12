@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(mContext, com.travelersdiary.activities.FullScreenImageActivity.class);
    intent.putExtra("images", mImagesList);
    intent.putExtra("position", viewHolder.getAdapterPosition());
    mContext.startActivity(intent);
}