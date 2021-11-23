public java.lang.String getRoomDescription() {
    android.util.Log.i("teng DROOOfbdfbgr222", roomDescript);
    if ((roomDescript) == "") {
        return backUpRoomDescription;
    }
    return roomDescript;
}