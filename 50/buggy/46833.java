@java.lang.Override
public void onBindViewHolder(final adapter.EstacaoAdapter.PersonViewHolder personViewHolder, int position) {
    personViewHolder.tvSupervisor.setText(lista.get(position).getDescricao());
    personViewHolder.cbCheck.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
        }
    });
}