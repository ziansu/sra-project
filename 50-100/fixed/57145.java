@java.lang.Override
public void onRecyclerItemClick(android.support.v7.widget.RecyclerView recyclerView, android.view.View view, int position, long id) {
    de.aw.wertpapier.action.FragmentWertpapierUmsatz frag = de.aw.wertpapier.action.FragmentWertpapierUmsatz.newInstance(id);
    final android.app.FragmentManager fm = getFragmentManager();
    fm.beginTransaction().replace(container, frag, frag.getTAG()).addToBackStack(null).commit();
    super.onRecyclerItemClick(recyclerView, view, position, id);
}