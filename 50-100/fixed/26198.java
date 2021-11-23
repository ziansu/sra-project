public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.econoom.entidade.Produto produto;
    produto = ((com.econoom.entidade.Produto) (parent.getItemAtPosition(position)));
    if ((produto.getDescNotaValor()) != null) {
        android.widget.Toast.makeText(getActivity(), produto.getDescNotaValor(), Toast.LENGTH_LONG).show();
    }
}