@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case Task.SEND_MSG :
            com.example.rolo.bluetoothchatroom.Toast.makeText(this, msg.obj.toString(), Toast.LENGTH_LONG).show();
            break;
        case Task.RECEIVE_MSG :
            chatHistoryData.add(msg.obj.toString());
            adapter.notifyDataSetChanged();
            break;
        case Task.GET_REMOTE_STATE :
            break;
        default :
            break;
    }
}