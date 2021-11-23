@java.lang.Override
public void run() {
    if ((pref.getInt("hasMessage", 0)) == 1) {
        android.util.Log.d("MESSAGE", pref.getString("message", ""));
        populateReceivedMsg(pref.getString("message", ""), pref.getString("userGroup", ""), getActivity(), java.lang.Integer.valueOf(pref.getString("groupUserIcon", "")));
        edit.putInt("hasMessage", 0);
        edit.apply();
    }
}