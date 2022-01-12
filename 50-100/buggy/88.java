@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(id);
    dest.writeString(originalTitle);
    dest.writeString(imageUrl);
    dest.writeString(backdropUrl);
    dest.writeString(overview);
    dest.writeDouble(userRating);
    dest.writeString(releaseDate);
}