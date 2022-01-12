@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.TextView t = ((android.widget.TextView) (view.findViewById(R.id.rowText)));
    saveMessages();
    mCurrentRoom = t.getText().toString();
    mCurrentRoomIndex = position;
    mTextAdapter.clearMessages();
    attemptJoinRoom(t.getText().toString());
    loadMessages(mCurrentRoom);
    mActionbar.setTitle(mCurrentRoom);
    mDrawer.closeDrawer(GravityCompat.START);
}