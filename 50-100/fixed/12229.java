@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeLong(this.id);
    dest.writeString(this.title);
    dest.writeString(this.releaseDate);
    dest.writeDouble(this.userRating);
    dest.writeString(this.plot);
    dest.writeString(this.posterPath);
    dest.writeString(this.genre);
}