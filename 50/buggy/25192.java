@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    savedInstanceState.putInt("Position", myVideoView.getCurrentPosition());
    myVideoView.pause();
}