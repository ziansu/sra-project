@java.lang.Override
public void onClick(android.view.View v) {
    int previousSelectedIndex = com.zfdang.multiple_images_selector.models.FolderListContent.selectedFolderIndex;
    com.zfdang.multiple_images_selector.models.FolderListContent.setSelectedFolder(holder.mItem, position);
    notifyItemChanged(previousSelectedIndex);
    notifyItemChanged(position);
    if (null != (mListener)) {
        mListener.onFolderItemInteraction(holder.mItem);
    }
}