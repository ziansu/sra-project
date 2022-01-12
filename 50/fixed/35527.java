@java.lang.Override
public void onFinished(java.lang.Exception e) {
    if ((callback) == null)
        return ;
    
    callback.onFinished(e);
}