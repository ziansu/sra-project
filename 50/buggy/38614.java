public void readFromParcel(android.os.Parcel in) {
    timestamp = in.readLong();
    in.readFloatArray(values);
    valuesList = new java.util.ArrayList();
    in.readList(valuesList, getClass().getClassLoader());
}