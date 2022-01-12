@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        tracks = savedInstanceState.getParcelableArrayList("com.ekeitho.toptracks");
        songPosition = savedInstanceState.getInt("com.ekeitho.trackpos");
    }else
        if ((getArguments()) != null) {
            tracks = getArguments().getParcelableArrayList("com.ekeitho.toptracks");
            songPosition = getArguments().getInt("com.ekeitho.trackpos");
        }
    
    super.onCreate(savedInstanceState);
}