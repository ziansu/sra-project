public void setEnabled(boolean isEnabled) {
    tvUsername.setEnabled(isEnabled);
    ivProfileImage.setEnabled(isEnabled);
    ibOfferAccept.setEnabled(isEnabled);
    ibOfferReject.setEnabled(isEnabled);
    if (!isEnabled) {
        ivProfileImage.setAlpha(0.1F);
        tickerPrice.setAlpha(0.1F);
    }
}