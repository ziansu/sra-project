@java.lang.Override
public void onDataChange(com.wilddog.client.DataSnapshot dataSnapshot) {
    java.lang.Object value = dataSnapshot.getValue();
    if (value != null) {
        boolean send = ((boolean) (value));
        if (send) {
            android.util.Log.d("lk", "onDataChange:send");
            keyDownUp(KeyEvent.KEYCODE_ENTER);
            ref_send.setValue(false);
        }
    }
}