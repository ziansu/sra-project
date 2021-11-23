@java.lang.Override
public int compareTo(Assignment4.Song s) {
    if ((s.mRating) == (mRating)) {
        return mTitle.compareTo(s.mTitle);
    }
    return (mRating) > (s.mRating) ? 1 : -1;
}