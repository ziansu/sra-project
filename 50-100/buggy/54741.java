protected void anmiateToCardNumber() {
    if ((mState) != (com.hunk.nobank.feature.registration.activity.CardInfoActivity.State.CardNumber)) {
        mState = com.hunk.nobank.feature.registration.activity.CardInfoActivity.State.CardNumber;
        int length = 0 - (getLength());
        com.hunk.nobank.util.ViewHelper.translateX(mCardCVVInput, length, 0, NConstants.ANIMATION_DURATION_MEDIUM);
        com.hunk.nobank.util.ViewHelper.translateX(mCardNumberInput, length, 0, NConstants.ANIMATION_DURATION_MEDIUM);
        com.hunk.nobank.util.ViewHelper.translateX(mCardCVVLabel, length, 0, NConstants.ANIMATION_DURATION_MEDIUM);
    }
}