@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.email);
    dest.writeStringArray(this.labels);
    dest.writeLong(this.uid);
    dest.writeLong(this.receivedDateInMillisecond);
    dest.writeLong(this.sentDateInMillisecond);
    dest.writeStringArray(this.from);
    dest.writeStringArray(this.to);
    dest.writeString(this.subject);
    dest.writeStringArray(this.flags);
}