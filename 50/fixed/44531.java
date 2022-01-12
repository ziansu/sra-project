@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.id);
    dest.writeString(this.author);
    dest.writeString(this.content);
    dest.writeString(this.url);
}