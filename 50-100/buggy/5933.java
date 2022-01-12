@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        android.os.Message message = new android.os.Message();
        message.what = 2;
        message.obj = "bottom1";
        mt1Handler.sendMessage(message);
    }else
        if (!isVisibleToUser) {
            android.util.Log.e("===========", "bu shi ke jian d");
        }
    
}