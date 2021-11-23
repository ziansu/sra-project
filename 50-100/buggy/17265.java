@java.lang.Override
public void onDataChange(com.wilddog.client.DataSnapshot dataSnapshot) {
    boolean send = ((boolean) (dataSnapshot.getValue()));
    if (send) {
        android.util.Log.d("lk", "onDataChange:send");
        keyDownUp(KeyEvent.KEYCODE_ENTER);
        ref_send.setValue(false);
    }
}