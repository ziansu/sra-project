@java.lang.Override
public com.example.android.popularmovies.Review createFromParcel(android.os.Parcel source) {
    android.os.Bundle bundle = source.readBundle();
    com.example.android.popularmovies.Review _review = new com.example.android.popularmovies.Review(bundle.getString(com.example.android.popularmovies.Review.KEY_ID), bundle.getString(com.example.android.popularmovies.Review.KEY_AUTHOR), bundle.getString(com.example.android.popularmovies.Review.KEY_CONTENT), bundle.getString(com.example.android.popularmovies.Review.KEY_URL));
    return _review;
}