private void initView() {
    rv_scc = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.rv_scc)));
    lo_mng = new android.support.v7.widget.LinearLayoutManager(this);
    adapter = new com.doricovix.utif.retrofitgetmysql.SccAdapter(this, itemScc);
    itemScc = new java.util.ArrayList<>();
    rv_scc.setLayoutManager(lo_mng);
    rv_scc.setAdapter(adapter);
    loadDataFromServer();
}