@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    java.lang.System.out.println("---> save from Details");
    outState.putSerializable("currentVideo", video);
}