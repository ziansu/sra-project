private void setRecycler() {
    appuntamentiAdapter = new it.uniba.di.sss1415.app_consulenze.adapter.AppuntamentiAdapter(getActivity(), appuntamenti, this);
    recyclerView.setAdapter(appuntamentiAdapter);
}