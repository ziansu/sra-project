public void FilterAdjustments(java.lang.String status) {
    java.util.ArrayList<team5.ad.sa40.stationeryinventory.Model.JSONAdjustment> temp = new java.util.ArrayList<>();
    for (int i = 0; i < (mAdjustment.size()); i++) {
        if (status == (mAdjustment.get(i).getStatus())) {
            temp.add(mAdjustment.get(i));
        }
    }
    mAdapter.mAdjustments = temp;
    mAdapter.notifyDataSetChanged();
}