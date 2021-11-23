@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    savedInstanceState.getInt(com.example.android.quizapp.MainActivity.STATE_SCORE);
}