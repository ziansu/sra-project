@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(this.id);
    dest.writeString(this.name);
    dest.writeInt(this.seed);
    if ((photo) == null) {
        return ;
    }
    dest.writeInt(this.photo.length);
    dest.writeByteArray(this.photo);
}