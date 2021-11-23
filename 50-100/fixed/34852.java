@java.lang.Override
public void onFragmentInteraction(java.lang.String mvId) {
    com.example.shaysheli.androaid_final.fragments.AddOrEditFragment details = com.example.shaysheli.androaid_final.fragments.AddOrEditFragment.newInstance(mvId, "Edit");
    com.example.shaysheli.androaid_final.MainActivity.tran = getFragmentManager().beginTransaction();
    com.example.shaysheli.androaid_final.MainActivity.tran.hide(this.movieDetailFragmentInstance);
    com.example.shaysheli.androaid_final.MainActivity.tran.addToBackStack("backToDetail");
    com.example.shaysheli.androaid_final.MainActivity.tran.add(R.id.main_container, details).commit();
}