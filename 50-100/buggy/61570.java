@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(this.left);
    dest.writeInt(this.right);
    dest.writeInt(this.top);
    dest.writeInt(this.bottom);
    dest.writeInt(this.width);
    dest.writeInt(this.heigth);
}