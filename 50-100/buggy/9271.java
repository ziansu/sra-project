private void RenderListView(java.util.List<com.amelendez.lgo.storage.dao.Languo> languos) {
    if (languos == null) {
        languos = new java.util.ArrayList<>();
    }
    adapter = new com.amelendez.lgo.adapters.LanguoListAdapter(this, languos);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.main_listView)));
    listView.setAdapter(adapter);
}