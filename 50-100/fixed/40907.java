public void onLoadComplete(android.media.SoundPool soundPool, int sampleId, int status) {
    if ((status == 0) && (com.rjfun.cordova.plugin.nativeaudio.NativeAudio.waitingMap.containsKey(sampleId))) {
        java.lang.String audioKey = ((java.lang.String) (com.rjfun.cordova.plugin.nativeaudio.NativeAudio.waitingMap.get(sampleId)));
        com.rjfun.cordova.plugin.nativeaudio.NativeAudio.soundMap.put(audioKey, sampleId);
        synchronized(com.rjfun.cordova.plugin.nativeaudio.NativeAudio.waitingMap) {
            com.rjfun.cordova.plugin.nativeaudio.NativeAudio.waitingMap.remove(sampleId);
        }
    }
}