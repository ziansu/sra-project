@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int position) {
    a1.a2017.iff.seriesanimes.Adapter.SerieAdapter.SerieViewHolder holder_series = ((a1.a2017.iff.seriesanimes.Adapter.SerieAdapter.SerieViewHolder) (viewHolder));
    a1.a2017.iff.seriesanimes.Model.Serie serie = series.get(position);
    holder_series.tituloSerie.setText(serie.getTitulo());
    holder_series.ano_lancamentoSerie.setText(serie.getAno_lancamento());
    holder_series.descricaoSerie.setText(serie.getDescricao());
    holder_series.tipoSerie.setText(serie.getTipo());
    android.util.Log.i("------XXXXXXXXX------", serie.getDescricao());
}