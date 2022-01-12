private boolean deleteImageFromGallery() {
    if ((mImages.size()) > 0) {
        java.io.File f = mImages.get(mCurrentPosition);
        if (f.exists()) {
            boolean b = f.delete();
            if (b) {
                mImages.remove(f);
                com.hsfl.speakshot.service.audio.AudioService.getInstance().speak(getResources().getString(R.string.read_mode_snapshot_deleted));
            }
            return b;
        }
    }
    return false;
}