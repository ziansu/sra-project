@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(title);
    dest.writeString(posterPath);
    dest.writeString(rating);
    dest.writeString(description);
    dest.writeString(releaseDate);
    dest.writeString(url);
}