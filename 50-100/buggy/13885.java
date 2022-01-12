private void onFinish() {
    this.callbacks.onSuccess();
    java.io.File f = this.usedFiled.get(com.gcw.sapienza.places.utils.FlagUploader.AUDIO_KEY);
    android.util.Log.d(com.gcw.sapienza.places.utils.FlagUploader.TAG, ((("Deleted file: " + (f.getName())) + " ? ") + (f.delete())));
    this.usedFiled.clear();
}