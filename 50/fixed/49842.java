@java.lang.Override
public void onHitsChange(int newValue) {
    if ((mSheetPlayerCharacter.getCurHits()) != newValue) {
        mSheetPlayerCharacter.setCurHits(newValue);
        mHitsButton.setText(java.lang.Integer.toString(mSheetPlayerCharacter.getCurHits()));
    }
}