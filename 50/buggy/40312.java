@java.lang.Override
public void onResume() {
    android.widget.Toast.makeText(getActivity(), "Updating", Toast.LENGTH_SHORT).show();
    initComponents(getView());
    updateMovies();
    super.onResume();
}