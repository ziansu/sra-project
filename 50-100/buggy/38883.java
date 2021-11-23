@java.lang.Override
public void onListFragmentInteraction(com.example.shaysheli.androaid_final.Model.Movie item) {
    com.example.shaysheli.androaid_final.fragments.MovieDetailFragment mvDetail = com.example.shaysheli.androaid_final.fragments.MovieDetailFragment.newInstance(item.id);
    this.movieDetailFragmentInstance = mvDetail;
    com.example.shaysheli.androaid_final.MainActivity.tran = getFragmentManager().beginTransaction();
    com.example.shaysheli.androaid_final.MainActivity.tran.hide(this.movieListFragmentInstance);
    com.example.shaysheli.androaid_final.MainActivity.tran.addToBackStack("backToList");
    com.example.shaysheli.androaid_final.MainActivity.tran.add(R.id.main_container, mvDetail);
    com.example.shaysheli.androaid_final.MainActivity.tran.commit();
}