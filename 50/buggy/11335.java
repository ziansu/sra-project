public void updateData(android.util.SparseArray<com.quickblox.content.model.QBFile> qbFileSparseArr) {
    this.qbFileSparseArray = qbFileSparseArr;
    notifyDataSetChanged();
}