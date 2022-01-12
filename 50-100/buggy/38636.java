private void onGuestbookImageClicked(int adapterPosition) {
    if ((adapterPosition >= 0) && (adapterPosition < (mPlaceCheckins.size()))) {
        no.dnt.sjekkut.realmmodels.PlaceCheckin checkin = mPlaceCheckins.get(adapterPosition);
        if ((mPhotoClickedListener) != null) {
            java.lang.String url = checkin.getImageUrl(no.dnt.sjekkut.Utils.getDisplayWidth(mContext));
            if (url != null) {
                mPhotoClickedListener.onPhotoClicked(checkin.getPhoto().getId(), url);
            }
        }
    }
}