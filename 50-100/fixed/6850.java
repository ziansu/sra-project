protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putByteArray("audio", this.getShareFragment().getAudio());
    outState.putByteArray("pic", this.getShareFragment().getPic());
    outState.putByteArray("video", this.getShareFragment().getVideo());
}