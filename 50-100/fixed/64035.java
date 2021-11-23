@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeLong(id);
    dest.writeLong(timeLong);
    dest.writeParcelable(location, flags);
    dest.writeString(soundUriString);
    dest.writeByte(((byte) (vibrate ? 1 : 0)));
}