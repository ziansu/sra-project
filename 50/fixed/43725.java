public java.lang.String getRoomDescription() {
    android.util.Log.i("teng DROOOfbdfbgr222", roomDescript);
    if ((roomDescript.equals("")) || (roomDescript.equals(null))) {
        roomDescript = backUpRoomDescription;
    }
    return roomDescript;
}