@java.lang.Override
public void onListFragmentInteraction(com.example.shaysheli.androaid_final.Model.Movie item) {
    if ((movieDetailFragmentInstance) == null) {
        this.movieDetailFragmentInstance = com.example.shaysheli.androaid_final.fragments.MovieDetailFragment.newInstance(item.id);
        com.example.shaysheli.androaid_final.MainActivity.tran = getFragmentManager().beginTransaction();
        com.example.shaysheli.androaid_final.MainActivity.tran.hide(this.movieListFragmentInstance);
        com.example.shaysheli.androaid_final.MainActivity.tran.add(R.id.main_container, this.movieDetailFragmentInstance);
        com.example.shaysheli.androaid_final.MainActivity.tran.commit();
    }
}