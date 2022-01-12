private void updateUI() {
    mSongTitle.setText(mSongs.get(songIndex).getTitle().substring(1).replace(".ogg", ""));
    mBackgroundImage.setImageResource(images.get(songIndex));
    pl.droidsonroids.gif.GifDrawable gifDrawable = ((pl.droidsonroids.gif.GifDrawable) (mBackgroundImage.getDrawable()));
    gifDrawable.start();
}