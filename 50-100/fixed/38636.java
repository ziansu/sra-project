private void onGuestbookImageClicked(int position) {
    if ((position >= 0) && (position < (mPlaceCheckins.size()))) {
        no.dnt.sjekkut.realmmodels.PlaceCheckin checkin = mPlaceCheckins.get(position);
        if ((mPhotoClickedListener) != null) {
            java.lang.String url = checkin.getImageUrl(no.dnt.sjekkut.Utils.getDisplayWidth(mContext));
            if (url != null) {
                mPhotoClickedListener.onPhotoClicked(checkin.getPhoto().getId(), url);
            }
        }
    }
}