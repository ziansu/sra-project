@java.lang.Override
public void onBindViewHolder(com.literature.android.literature.adapters.CaptionViewHolder holder, int position) {
    java.lang.String caption = mCaptions.get(position);
    int authorIdForDb = (mAuthorId) + 1;
    boolean isFavorite = com.literature.android.literature.Manager.sharedManager().getCaptionStatus(authorIdForDb, caption);
    int captionId = com.literature.android.literature.Manager.sharedManager().getCaptionId(authorIdForDb, caption);
    if ((-1) == captionId) {
        return ;
    }
    captionId -= 1;
    holder.bindDrawable(caption, captionId, isFavorite);
}