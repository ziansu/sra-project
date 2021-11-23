private void loadBackgroundImage(java.lang.String imageUrl) {
    if (isAdded()) {
        return ;
    }
    mTarget = new com.sregg.android.tv.spotifyPlayer.fragments.ArtistsDetailsFragment.BackgroundTarget();
    com.squareup.picasso.Picasso.with(getActivity()).load(imageUrl).transform(new com.sregg.android.tv.spotifyPlayer.utils.BlurTransformation(getActivity().getApplicationContext())).resize(mMetrics.widthPixels, mMetrics.heightPixels).centerCrop().into(mTarget);
}