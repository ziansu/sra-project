@java.lang.Override
public void onClick(android.view.View view) {
    try {
        cc.xiaoyuanzi.pianorobot.data.Staff staff = cc.xiaoyuanzi.pianorobot.generate.file.FileStaffReader.getStaff(mNameTextView.getText().toString(), mMusicContentTextView.getText().toString());
        cc.xiaoyuanzi.pianorobot.player.PianoPlayer.getPlayer().play(this, staff);
    } catch (java.lang.Exception e) {
        new android.support.v7.app.AlertDialog.Builder(this).setMessage(e.getMessage()).show();
    }
}