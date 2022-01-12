@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeStringArray(new java.lang.String[]{ (id) + "" , (path) == null ? null : path.toString() , (poster) == null ? null : poster.toString() , title , releaseDate , (voteAverage) + "" , (popularity) + "" , plotSynopsis });
}