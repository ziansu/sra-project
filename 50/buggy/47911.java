@java.lang.Override
public void onPictureDelete() {
    mAlbum.setPictureDownloaded(false);
    header.image.setImageBitmap(com.airplayer.util.BitmapUtils.getWindowWideBitmap(getActivity(), mAlbum.getAlbumArtPath(), false));
}