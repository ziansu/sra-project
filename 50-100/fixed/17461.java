public void stopRecord(android.view.View v) {
    if (!(mBound))
        return ;
    
    android.os.Bundle b = new android.os.Bundle();
    b.putString("str1", ("ab" + ("hi" + "cd")));
    android.os.Message msg = android.os.Message.obtain(null, 2);
    msg.setData(b);
    try {
        mService.send(msg);
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    }
}