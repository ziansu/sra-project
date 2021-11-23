private void launchInvitePeople() {
    if ((null != (mSession)) && (null != (mRoom))) {
        android.content.Intent intent = new android.content.Intent(this, im.vector.activity.VectorRoomInviteMembersActivity.class);
        intent.putExtra(VectorRoomInviteMembersActivity.EXTRA_MATRIX_ID, mSession.getMyUserId());
        intent.putExtra(VectorRoomInviteMembersActivity.EXTRA_ROOM_ID, mRoom.getRoomId());
        intent.putExtra(VectorRoomInviteMembersActivity.EXTRA_ADD_CONFIRMATION_DIALOG, true);
        startActivityForResult(intent, im.vector.activity.VectorRoomActivity.INVITE_USER_REQUEST_CODE);
    }
}