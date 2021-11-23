public void writeOutData() {
    try {
        saveUser = new com.example.android.rowanparkingpass.SavedData.SaveUser(com.example.android.rowanparkingpass.SavedData.SaveData.getUSR(), com.example.android.rowanparkingpass.SavedData.SaveData.getSync(), com.example.android.rowanparkingpass.SavedData.SaveData.getQueue());
        com.example.android.rowanparkingpass.SavedData.ReadWrite.WRITE_OUT(saveUser, this.getApplicationContext());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}