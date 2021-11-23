@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeString(location);
    dest.writeLong(date_created);
}