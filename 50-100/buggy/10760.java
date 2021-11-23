@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.userID);
    dest.writeString(this.title);
    dest.writeString(this.subtitle);
    dest.writeLong(this.chatTime);
    dest.writeString(this.image);
    dest.writeByte((this.isGroup ? ((byte) (1)) : ((byte) (0))));
}