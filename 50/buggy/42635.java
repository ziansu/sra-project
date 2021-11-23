public void setDatas(java.util.List<com.example.test.model.RecordModel> datas) {
    mDatas.clear();
    this.mDatas = datas;
    notifyDataSetChanged();
}