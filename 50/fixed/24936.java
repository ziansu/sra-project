private void readFromParcel(android.os.Parcel in) {
    unitIds = new java.util.ArrayList<>();
    in.readList(unitIds, null);
}