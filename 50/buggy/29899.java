@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    android.util.Log.i(com.bignerdranch.android.geoquiz.QuizActivity.TAG, "onSaveInstanceState");
    savedInstanceState.putInt(com.bignerdranch.android.geoquiz.QuizActivity.KEY_INDEX, mCurrentIndex);
}