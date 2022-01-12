@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeTypedList(this.dots);
    dest.writeParcelable(this.listener, flags);
}