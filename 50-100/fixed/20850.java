public void onFragmentInteractionChangeFrag(android.app.Fragment frag) {
    com.example.shaysheli.androaid_final.MainActivity.tran = getFragmentManager().beginTransaction();
    if (frag instanceof com.example.shaysheli.androaid_final.fragments.MovieListFragment) {
        this.movieListFragmentInstance = ((com.example.shaysheli.androaid_final.fragments.MovieListFragment) (frag));
        com.example.shaysheli.androaid_final.MainActivity.tran.replace(R.id.main_container, frag);
    }else {
        com.example.shaysheli.androaid_final.MainActivity.tran.addToBackStack("backToLogin");
        com.example.shaysheli.androaid_final.MainActivity.tran.add(R.id.main_container, frag);
    }
    com.example.shaysheli.androaid_final.MainActivity.tran.commit();
}