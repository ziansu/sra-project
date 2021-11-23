@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviedroidPropertyReader = com.cloudskol.moviedroid.common.MoviedroidPropertyReader.getInstance(getActivity());
    moviedroidUriBuilder = new com.cloudskol.moviedroid.common.MoviedroidUriBuilder(moviedroidPropertyReader);
    setHasOptionsMenu(true);
}