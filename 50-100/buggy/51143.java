@java.lang.Override
public void onSwipeTop() {
    if ((select_index) == 0) {
        m_launcher.play(Launcher.BOUNCE_33);
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), ac.actestapp.Activity2.class);
        startActivity(intent);
    }else
        if ((select_index) == 1) {
            m_launcher.play(Launcher.EXPLOSION3);
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), ac.actestapp.Simon_Says.class);
            startActivity(intent);
        }else
            android.media.MediaPlayer.create(getApplicationContext(), R.raw.unavailable).start();
        
    
}