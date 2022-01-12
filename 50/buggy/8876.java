@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(getName());
    dest.writeString(getLocation());
    dest.writeValue(getStartTime());
    dest.writeValue(getEndTime());
}