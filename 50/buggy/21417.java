public void onSavedInstanceState(android.os.Bundle saveInstanceState) {
    super.onSaveInstanceState(saveInstanceState);
    saveInstanceState.putBoolean(geoquiz.android.bignerdranch.com.geoquiz.CheatActivity.EXTRA_ANSWER_SHOWN, mIsCheater);
}