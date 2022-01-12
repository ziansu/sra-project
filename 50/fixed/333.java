@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    cc.xiaoyuanzi.pianorobot.player.PianoPlayer.getPlayer(this).play(mStaffList.get(i));
}