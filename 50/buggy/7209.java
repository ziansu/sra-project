@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.server);
    dest.writeString(this.email);
    dest.writeValue(this.is_shib);
    dest.writeString(this.token);
}