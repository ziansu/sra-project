@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeString(fileName);
    dest.writeParcelable(warranty, flags);
    dest.writeInt(position);
}