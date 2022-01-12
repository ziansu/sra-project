@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(mNumber);
    dest.writeInt(mImage);
    dest.writeString(mName);
    dest.writeString(getAlias());
    dest.writeString(mType1.name());
    dest.writeString(((mType2) != null ? mType2.name() : null));
}