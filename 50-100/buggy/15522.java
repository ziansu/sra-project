private void updateUI() {
    mSongTitle.setText(mSongs.get(songIndex).getTitle().replace(".ogg", ""));
    mBackgroundImage.setImageResource(images.get(songIndex));
    pl.droidsonroids.gif.GifDrawable gifDrawable = ((pl.droidsonroids.gif.GifDrawable) (mBackgroundImage.getDrawable()));
    gifDrawable.start();
}