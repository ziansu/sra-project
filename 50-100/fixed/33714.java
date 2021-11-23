@java.lang.Override
public void onBindViewHolder(tr.edu.boun.cmpe.sculture.adapter.StoryImageViewAdapter.ViewHolder holder, int position) {
    if (is_create) {
        holder.local_imageView.setVisibility(View.VISIBLE);
        holder.local_imageView.setImageURI(uris.get(position));
        holder.imageView.setVisibility(View.GONE);
    }else {
        holder.imageView.setVisibility(View.VISIBLE);
        holder.imageView.setImageUrl((((tr.edu.boun.cmpe.sculture.BuildConfig.API_BASE_URL) + "/image/get/") + (urls.get(position))), BaseApplication.baseApplication.mImageLoader);
        holder.local_imageView.setVisibility(View.GONE);
    }
    holder.index = position;
}