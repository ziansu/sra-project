@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(ImageUrl);
    dest.writeString(movieTitle);
    dest.writeString(description);
    dest.writeString(releaseDate);
    dest.writeInt(voteCount);
    dest.writeDouble(popularity);
}