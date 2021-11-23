@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(getEntry().getAbsolutePath());
    dest.writeBooleanArray(new boolean[]{ isSelected , isParent });
}