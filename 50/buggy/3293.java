public void setData(java.util.List<sinolight.cn.qgapp.data.bean.KDBResData> data) {
    if ((mData) != null) {
        mData.clear();
        mData.addAll(data);
    }else {
        mData = data;
    }
    notifyDataSetChanged();
}