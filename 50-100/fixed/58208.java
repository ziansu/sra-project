@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    boolean handled = true;
    java.lang.Object removed = null;
    if ((msg.what) == (com.iwhys.library.lifecycle.InnerManagerRetriever.REMOVE)) {
        android.app.FragmentManager fm = ((android.app.FragmentManager) (msg.obj));
        removed = mPendingLifecycleFragments.remove(fm);
    }else {
        handled = false;
    }
    if (handled && (removed == null)) {
        android.util.Log.w(com.iwhys.library.lifecycle.InnerManagerRetriever.TAG, "注意：移除指定的生命周期Fragment失败");
    }
    return handled;
}