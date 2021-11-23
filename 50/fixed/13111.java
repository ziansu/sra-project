@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if ((0 <= position) && (position < (mPages.length))) {
        return mContext.getString(mPages[position]);
    }else {
        return "";
    }
}