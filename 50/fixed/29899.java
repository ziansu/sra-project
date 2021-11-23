@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    savedInstanceState.putInt(com.bignerdranch.android.geoquiz.QuizActivity.KEY_INDEX, mCurrentIndex);
}