@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeStringArray(new java.lang.String[]{ (id) + "" , path.toString() , poster.toString() , title , releaseDate , (voteAverage) + "" , (popularity) + "" , plotSynopsis });
}