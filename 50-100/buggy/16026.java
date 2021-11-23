public void initData(final android.os.Handler handler, final int handleCode) throws com.avos.avoscloud.AVException {
    com.kerchin.yellownote.utilities.Trace.d("loadData");
    if (handler != null) {
        outHandler = handler;
        outHandleCode = handleCode;
    }
    com.kerchin.yellownote.bean.PrimaryData.status.clear();
    listNote.clear();
    map.clear();
    getNotesFromCloud();
    listFolder.clear();
    getFolderFromCloud();
    mHandler.post(runnableForSimple);
}