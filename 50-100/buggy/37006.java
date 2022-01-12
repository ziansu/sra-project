public void onClick(android.view.View v) {
    stopService(new android.content.Intent(this, com.softwarei.epar2016.MusicPlayer.class));
    final android.content.Intent music = new android.content.Intent(getApplication(), com.softwarei.epar2016.MusicPlayer.class);
    music.putExtra("index", 1);
    startService(music);
    android.content.Intent Menu = new android.content.Intent(this, com.softwarei.epar2016.MainGame.class);
    Menu.putExtra("run", 0);
    startActivity(Menu);
}