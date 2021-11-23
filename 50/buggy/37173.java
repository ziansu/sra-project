private void writeStringToParcel(android.os.Parcel p, java.lang.String s) {
    p.writeByte(((byte) (s != null ? 1 : 0)));
    p.writeString(s);
}