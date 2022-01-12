@java.lang.Override
public void initForMenu(android.content.Context context, com.android.internal.view.menu.MenuBuilder menu) {
    if ((mThemeRes) != 0) {
        mContext = new android.view.ContextThemeWrapper(context, mThemeRes);
        mInflater = android.view.LayoutInflater.from(mContext);
    }else
        if ((mContext) != null) {
            mContext = context;
            if ((mInflater) == null) {
                mInflater = android.view.LayoutInflater.from(mContext);
            }
        }
    
    mMenu = menu;
}