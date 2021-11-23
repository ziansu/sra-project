public void readFromParcel(android.os.Parcel in) {
    this.id = in.readInt();
    this.url = in.readString();
    this.frequency = in.readLong();
    this.timestamp = in.readLong();
}