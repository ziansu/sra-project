public void setData(java.util.List<com.whatmedia.ttia.response.data.ClockData> data) {
    mItems = data;
    mSelectItems.clear();
    if ((data != null) && ((data.size()) > 0)) {
        com.whatmedia.ttia.utility.Util.setAlertClock(mContext, data.get(((data.size()) - 1)));
    }
    notifyDataSetChanged();
}