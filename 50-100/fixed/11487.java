public void startRecord(android.view.View v) {
    if (!(mBound))
        return ;
    
    android.os.Bundle b = new android.os.Bundle();
    java.lang.String filePath = ((m_chosenDir) + (java.io.File.separator)) + (hookString);
    b.putString("str1", filePath);
    android.os.Message msg = android.os.Message.obtain(null, 1);
    msg.setData(b);
    try {
        mService.send(msg);
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    }
}