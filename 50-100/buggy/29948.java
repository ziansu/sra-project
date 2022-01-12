@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(endTimeString);
    dest.writeString(message);
    dest.writeString(name);
    dest.writeString(startTimeString);
    dest.writeValue(houseDateString);
    if ((items) == null) {
        dest.writeByte(((byte) (0)));
    }else {
        dest.writeByte(((byte) (1)));
        dest.writeList(items);
    }
}