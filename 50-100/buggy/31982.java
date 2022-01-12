@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int flags) {
    super.writeToParcel(parcel, flags);
    parcel.writeString(name);
    parcel.writeString(avatar);
    parcel.writeByte(((byte) (isInstructor ? 1 : 0)));
    parcel.writeString(getLastMessage());
    parcel.writeInt(color);
    parcel.writeTypedList(getMessages());
}