@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(this.id);
    dest.writeString(this.author);
    dest.writeString(this.content);
    dest.writeString(this.url);
}