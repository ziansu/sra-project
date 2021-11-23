@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    if ((savedInstanceState != null) && (savedInstanceState.containsKey("key"))) {
        movieList = savedInstanceState.getParcelableArrayList("key");
        hasData = true;
        android.util.Log.wtf("foobar", "set hasData to true");
    }
    super.onActivityCreated(savedInstanceState);
}