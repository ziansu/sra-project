@java.lang.Override
public void initForMenu(android.content.Context context, com.android.internal.view.menu.MenuBuilder menu) {
    if ((mThemeRes) != 0) {
        mContext = new android.view.ContextThemeWrapper(context, mThemeRes);
    }else
        if ((mContext) != null) {
            mContext = context;
        }
    
    mInflater = android.view.LayoutInflater.from(mContext);
    mMenu = menu;
}