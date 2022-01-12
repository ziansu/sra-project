void datainicial() {
    values = filmData.getAllFilmstitol();
    listViewAdapter = new android.widget.ArrayAdapter(getActivity().getApplicationContext(), R.layout.list_item, R.id.txtitem, values);
    listView.setAdapter(listViewAdapter);
}