@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.titulo);
    habilitaBluetoothSeExistir();
    me.chester.minitruco.android.Publicidade.inicializa(this);
    preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    boolean mostraInstrucoes = preferences.getBoolean("mostraInstrucoes", true);
    if (mostraInstrucoes) {
        android.content.SharedPreferences.Editor e = preferences.edit();
        e.putBoolean("mostraInstrucoes", false);
        e.commit();
        mostraAlertBox(this.getString(R.string.titulo_ajuda), this.getString(R.string.texto_ajuda));
    }
}