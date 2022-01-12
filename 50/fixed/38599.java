@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        savedInstanceState.putInt(com.example.android.quizapp.MainActivity.STATE_SCORE, score);
        super.onSaveInstanceState(savedInstanceState);
    }
}