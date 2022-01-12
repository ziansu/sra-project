@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    if ((getArguments()) != null) {
        tracks = getArguments().getParcelableArrayList("com.ekeitho.toptracks");
        songPosition = getArguments().getInt("com.ekeitho.trackpos");
        android.util.Log.e("AHH", ("" + (songPosition)));
    }
    super.onCreate(savedInstanceState);
}