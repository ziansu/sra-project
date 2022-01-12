@java.lang.Override
public void onBindViewHolder(com.example.xunhu.xunchat.View.AllAdapters.PhotoGalleryAdapter.ViewHolder holder, int position) {
    bitmap = getBitmapFromMediaStore(position);
    if ((bitmap) != null) {
        holder.getIvPhotoGallery().setImageBitmap(bitmap);
    }
}