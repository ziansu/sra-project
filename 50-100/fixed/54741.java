protected void anmiateToCardNumber() {
    if ((mState) != (com.hunk.nobank.feature.registration.activity.CardInfoActivity.State.CardNumber)) {
        mState = com.hunk.nobank.feature.registration.activity.CardInfoActivity.State.CardNumber;
        int length = getLength();
        com.hunk.nobank.util.ViewHelper.translateX(mCardCVVInput, 0, length, NConstants.ANIMATION_DURATION_MEDIUM);
        com.hunk.nobank.util.ViewHelper.translateX(mCardNumberInput, 0, length, NConstants.ANIMATION_DURATION_MEDIUM);
        com.hunk.nobank.util.ViewHelper.translateX(mCardCVVLabel, 0, length, NConstants.ANIMATION_DURATION_MEDIUM);
    }
}