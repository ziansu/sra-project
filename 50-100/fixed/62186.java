public void play(android.view.View v) {
    loadAudioFile();
    try {
        mp.prepare();
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        if (true) {
        }
    }
    mp.setLooping(true);
    mp.start();
    sk.setMax(mp.getDuration());
    handler.postDelayed(updateBar, 100);
}