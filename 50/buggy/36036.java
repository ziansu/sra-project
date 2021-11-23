@java.lang.Override
public void onReload(int position) {
    ((com.epro.psmobile.adapter.UniversalListEntryAdapter) (ls.getAdapter())).notifyDataSetChanged();
    if ((dataReloadCompleted) != null) {
        dataReloadCompleted.onReloadComplete();
    }
}