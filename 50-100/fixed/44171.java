private boolean startMediaPlayerByFilePath(java.lang.String path) {
    if ((path != null) && (!(path.isEmpty()))) {
        try {
            mediaPlayer.setDataSource(path);
            mediaPlayer.prepare();
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }else {
        return false;
    }
    return true;
}