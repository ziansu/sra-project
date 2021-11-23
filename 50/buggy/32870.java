@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putParcelableArrayList("movies", movies);
    super.onSaveInstanceState(outState);
}