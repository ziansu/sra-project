public void addItem(android.graphics.drawable.Drawable icon, java.lang.String mTitle, java.lang.String mBody, java.lang.String mDate) {
    com.example.jaeseok.airshare.ListData addInfo = null;
    addInfo = new com.example.jaeseok.airshare.ListData();
    addInfo.mIcon = icon;
    addInfo.mTitle = mTitle;
    addInfo.mBody = mBody;
    addInfo.mDate = mDate;
    mListData.add(0, addInfo);
}