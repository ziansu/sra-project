@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if (position == 1) {
        return mContext.getString(R.string.now_playing);
    }
    if (position == 2) {
        return mContext.getString(R.string.artists);
    }else {
        return mContext.getString(R.string.favourites);
    }
}