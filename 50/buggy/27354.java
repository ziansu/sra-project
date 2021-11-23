public void readFromParcel(android.os.Parcel in) {
    this.id = in.readInt();
    this.url = in.readString();
    this.timestamp = in.readLong();
    this.frequency = in.readLong();
}