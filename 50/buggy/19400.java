@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    java.lang.System.out.println("!!REACHED COMPLETION!!");
    mp.reset();
    mp.release();
    mp = null;
}