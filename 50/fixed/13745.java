public void setFolders(java.util.List<com.kerchin.yellownote.bean.SimpleFolder> mFolders, java.util.List<com.kerchin.yellownote.bean.SimpleNote> mNotes) {
    this.mFolders = mFolders;
    this.mNotes = mNotes;
    initData(this.mFolders, false);
    notifyDataSetChanged();
}