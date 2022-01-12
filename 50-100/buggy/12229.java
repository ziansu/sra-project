@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(title);
    dest.writeString(genre);
    dest.writeString(posterPath);
    dest.writeString(plot);
    dest.writeString(releaseDate);
    dest.writeDouble(userRating);
    dest.writeLong(id);
}