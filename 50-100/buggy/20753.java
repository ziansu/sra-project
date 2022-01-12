@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.editor_action_save :
            ch.ethz.asl.dancebots.danceboteditor.handlers.SoundManager.startEncoding(this.getApplicationContext(), mProjectManager.getDanceBotMusicFile(), mProjectManager.getChoreoManager());
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}