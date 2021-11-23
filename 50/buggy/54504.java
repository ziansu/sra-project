@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(_id);
    dest.writeString(_title);
    dest.writeString(_text);
    dest.writeByteArray(_textBitmap);
}