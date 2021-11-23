@java.lang.Override
public void onTimeout(net.named_data.jndn.Interest interest) {
    (callbackCount)++;
    android.util.Log.i(com.example.cb.sn_android.NDN_service.TAG, ("Time out for interest" + (interest.getName().toUri())));
    android.util.Log.i(com.example.cb.sn_android.NDN_service.TAG, "register in gateway failed!");
}