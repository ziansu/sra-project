private static android.content.Context getContext() {
    synchronized(com.unbelievable.library.android.utils.PreferencesUtil.class) {
        if ((com.unbelievable.library.android.utils.PreferencesUtil.mContext) == null) {
            throw new java.lang.NullPointerException("Call PreferencesUtil.initialize(context) within your Application onCreate() method.");
        }else {
            return com.unbelievable.library.android.utils.PreferencesUtil.mContext;
        }
    }
}