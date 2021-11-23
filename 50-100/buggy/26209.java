public void onRadioButtonClicked(android.view.View view) {
    mEmojiRating = 0;
    if ((view.getId()) == (R.id.verd_radio_button)) {
        mEmojiRating = 3;
    }
    if ((view.getId()) == (R.id.good_radio_button)) {
        mEmojiRating = 2;
    }
    if ((view.getId()) == (R.id.average_radio_button)) {
        mEmojiRating = 1;
    }
    if ((view.getId()) == (R.id.bad_radio_button)) {
        mEmojiRating = 0;
    }
}