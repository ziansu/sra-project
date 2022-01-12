@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle b = getArguments();
    java.lang.String fileName = b.getString(com.koroshiya.fragments.ReadFragment.ARG_FILE, "");
    android.util.Log.i("FLA", ("Create: " + fileName));
    int page = b.getInt(com.koroshiya.fragments.ReadFragment.ARG_PAGE, (-1));
    reset(fileName, page, false);
}