public com.linxonline.mallet.audio.android.AudioBuffer load(final java.lang.String _file, final com.linxonline.mallet.util.settings.Settings _settings) {
    System.out.println(("Creating Audio Buffer for: " + _file));
    final byte[] buffer = com.linxonline.mallet.io.reader.ByteReader.readBytes(_file);
    if (buffer == null) {
        return null;
    }
    return new AudioBuffer<com.linxonline.mallet.audio.android.AndroidSound>(new com.linxonline.mallet.audio.android.AndroidSound(buffer));
}