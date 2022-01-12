private void readFromParcel(android.os.Parcel in) {
    meanings = new java.util.ArrayList<>();
    in.readStringList(meanings);
}