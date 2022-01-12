public static boolean cancel(int index) {
    if (index == (-1))
        return false;
    
    android.util.Log.d(co.theengine.loomplayer.LoomHTTP.TAG, (index + " cancel requested"));
    co.theengine.loomplayer.LoomHTTP.SendTask st = co.theengine.loomplayer.LoomHTTP.tasks[index];
    if (!(st.busy))
        return false;
    
    co.theengine.loomplayer.LoomHTTP.background.cancel(st);
    return true;
}