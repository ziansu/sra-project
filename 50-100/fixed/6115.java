@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setHasOptionsMenu(true);
    if ((savedInstanceState != null) && (savedInstanceState.containsKey("key"))) {
        movieList = savedInstanceState.getParcelableArrayList("key");
        hasData = true;
    }
}