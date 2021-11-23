public static <T extends ar.fiuba.jobify.shared_server_api.Nombrable> ar.fiuba.jobify.EditableListAdapter<T> populateEditableList(android.content.Context context, android.widget.ListView mListView, java.util.List<T> list) {
    if (mListView != null) {
        ar.fiuba.jobify.EditableListAdapter<T> mAdapter = new ar.fiuba.jobify.EditableListAdapter(context, mListView, list);
        mListView.setAdapter(mAdapter);
        ar.fiuba.jobify.EditableListAdapter.actualizarAlturaDeListView(mListView, mAdapter);
        return mAdapter;
    }else {
        android.util.Log.e("EditableListAdapter", "No se encontró el listview!");
        return null;
    }
}