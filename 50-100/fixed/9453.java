@java.lang.Override
public me.iwf.photopicker.adapter.PhotoGridAdapter.PhotoViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    me.iwf.photopicker.adapter.PhotoGridAdapter.PhotoViewHolder holder = PhotoPickUtils.holderGenerator.newGridViewHolder(mContext);
    if (viewType == (me.iwf.photopicker.adapter.PhotoGridAdapter.ITEM_TYPE_CAMERA)) {
        holder.vSelected.setVisibility(View.GONE);
        holder.ivPhoto.setScaleType(ImageView.ScaleType.CENTER);
        holder.ivPhoto.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                if ((onCameraClickListener) != null) {
                    onCameraClickListener.onClick(view);
                }
            }
        });
    }
    return holder;
}