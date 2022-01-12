@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.menu_setup)) {
        startActivity(org.zack.music.SetupActivity.newIntent(this));
    }else
        if ((item.getItemId()) == (R.id.menu_lyric)) {
            playBinder.onClickLyric();
        }
    
    return super.onOptionsItemSelected(item);
}