@java.lang.Override
public void onClick(android.view.View v) {
    if (((lmraViewHolder.listLMRAPhotos) != null) && ((lmraViewHolder.listLMRAPhotos.size()) > 0)) {
        com.bionic.kvt.serviceapp.db.DbUtils.removeLMRAPhoto(lmraViewHolder.lmraId, lmraViewHolder.listLMRAPhotos.get(lmraViewHolder.currentPhotoPosition).toString());
        com.bionic.kvt.serviceapp.db.DbUtils.updateLMRAList(LMRAActivity.lmraList);
        notifyDataSetChanged();
    }
}