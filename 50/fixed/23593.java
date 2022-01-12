@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviesAdapter = new com.example.nbtk123.tikalmovies.ui.RVMoviesAdapter(getActivity(), this, savedInstanceState);
    org.greenrobot.eventbus.EventBus.getDefault().register(moviesAdapter);
}