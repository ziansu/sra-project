@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 1 :
            {
                return mContext.getString(R.string.now_playing);
            }
        case 2 :
            {
                return mContext.getString(R.string.artists);
            }
        case 3 :
            {
                return mContext.getString(R.string.favourites);
            }
    }
    return null;
}