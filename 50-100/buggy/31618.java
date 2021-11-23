@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_historico_cliente);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    context = this;
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    list_view_babas = ((android.widget.ListView) (findViewById(R.id.list_view_babas)));
    abrirDetalhesBaba();
    new br.com.nannygo.app.HistoricoClienteActivity.ConfigurarHistoricoClienteTask().execute();
}