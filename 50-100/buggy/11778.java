@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.path);
    dest.writeLong(this.dateModified);
    dest.writeString(this.mime);
    dest.writeParcelable(this.uri, flags);
    dest.writeLong(this.id);
    dest.writeLong(this.size);
    dest.writeByte((this.selected ? ((byte) (1)) : ((byte) (0))));
}