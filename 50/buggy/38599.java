@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    savedInstanceState.putInt(com.example.android.quizapp.MainActivity.STATE_SCORE, score);
    super.onSaveInstanceState(savedInstanceState);
}