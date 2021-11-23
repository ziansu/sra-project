@java.lang.Override
public void onDestroy() {
    setLocalCanvas();
    super.onDestroy();
    com.example.kiwitech.socialsketch.MainActivity.thisRoomName = "";
    com.example.kiwitech.socialsketch.MainActivity.thisRoomID = "";
    com.example.kiwitech.socialsketch.MainActivity.roomMembers.clear();
}