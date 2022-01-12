@java.lang.Override
public void ChooseRoomFragmentInteraction(java.lang.String roomID, java.lang.String roomName, java.lang.Boolean local) {
    com.example.kiwitech.socialsketch.MainActivity.setIsLocal(local);
    if (local) {
        setLocalCanvas();
        com.example.kiwitech.socialsketch.MainActivity.thisRoomID = roomID;
        com.example.kiwitech.socialsketch.MainActivity.thisRoomName = roomName;
    }else {
        com.example.kiwitech.socialsketch.MainActivity.thisRoomID = roomID;
        com.example.kiwitech.socialsketch.MainActivity.thisRoomName = roomName;
        getRoomMembersFromDB();
        setRemoteCanvas();
        com.example.kiwitech.socialsketch.canvas.CanvasFragment canvasF = ((com.example.kiwitech.socialsketch.canvas.CanvasFragment) (getFragmentManager().findFragmentById(R.id.Canvas_Fragment)));
        canvasF.addNewSegmentListener();
    }
}