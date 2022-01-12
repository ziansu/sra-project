protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    android.util.Log.v(com.gcw.sapienza.places.MainActivity.TAG, "onSaveInstanceState called!");
    outState.putByteArray("audio", this.getShareFragment().getAudio());
    outState.putByteArray("pic", this.getShareFragment().getPic());
    outState.putByteArray("video", this.getShareFragment().getVideo());
}