private static void JNI_mediaplayer_load(java.lang.String filename) {
    io.github.sdlpal.Log.v(io.github.sdlpal.PalActivity.TAG, ("loading midi:" + filename));
    io.github.sdlpal.PalActivity.mediaPlayer.reset();
    io.github.sdlpal.PalActivity.mediaPlayer.setLooping(true);
    try {
        io.github.sdlpal.PalActivity.mediaPlayer.setDataSource(mSingleton.getApplicationContext(), android.net.Uri.fromFile(new java.io.File(filename)));
        io.github.sdlpal.PalActivity.mediaPlayer.prepare();
    } catch (java.io.IOException e) {
        io.github.sdlpal.Log.e(io.github.sdlpal.PalActivity.TAG, (filename + " not available for playing, check"));
    }
}