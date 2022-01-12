@java.lang.Override
public void writeToParcel(android.os.Parcel p, int arg1) {
    p.writeString(name);
    p.writeString(description);
    p.writeDouble(latitude);
    p.writeDouble(longitude);
    p.writeByte(((byte) (target ? 1 : 0)));
    p.writeString(data);
}