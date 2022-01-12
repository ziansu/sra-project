@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(id);
    dest.writeString(title);
    dest.writeInt(year);
    dest.writeInt(runtime);
    dest.writeString(theaterReleaseDate);
    dest.writeString(apiRating);
    dest.writeString(synopsis);
    dest.writeString(thumbnailURL);
}