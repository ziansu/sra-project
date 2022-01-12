@java.lang.Override
public com.example.android.popularmovies.Trailer createFromParcel(android.os.Parcel source) {
    android.os.Bundle bundle = source.readBundle();
    com.example.android.popularmovies.Trailer __trailer = new com.example.android.popularmovies.Trailer(bundle.getString(com.example.android.popularmovies.Trailer.KEY_ID), bundle.getString(com.example.android.popularmovies.Trailer.KEY_TRAILER), bundle.getString(com.example.android.popularmovies.Trailer.KEY_NAME), bundle.getString(com.example.android.popularmovies.Trailer.KEY_SITE), bundle.getInt(com.example.android.popularmovies.Trailer.KEY_RESOLUTIONP), bundle.getString(com.example.android.popularmovies.Trailer.KEY_SITE));
    return __trailer;
}