@java.lang.Override
public void onRestoreInstanceState(final android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    gameState.onRestoreInstanceState(savedInstanceState);
}