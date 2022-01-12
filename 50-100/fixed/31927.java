@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_edit_avaliacao, container, false);
    butterknife.ButterKnife.bind(this, view);
    preencherCampos();
    carregaEventos();
    carregaResultado(null);
    desabilitaEdicaoSeFinalizada();
    setHasOptionsMenu(true);
    return view;
}