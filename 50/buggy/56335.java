@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    com.odong.buddhismhomework.services.MusicService.MusicBinder binder = ((com.odong.buddhismhomework.services.MusicService.MusicBinder) (service));
    musicService = binder.getService();
    musicService.setSong(book.getMp3());
}