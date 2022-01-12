@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    out.writeSerializable(direction);
    out.writeInt((caseSensitive ? 1 : 0));
    super.writeToParcel(out, flags);
}