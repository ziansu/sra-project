@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((savedInstanceState == null) || (!(savedInstanceState.containsKey("movieList")))) {
    }else {
        movieList = savedInstanceState.getParcelableArrayList("movieList");
    }
    if ((getArguments()) != null) {
    }
}