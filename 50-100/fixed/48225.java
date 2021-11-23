@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (!(bRecuperando))
        gravarItensDaCotacao();
    
    android.content.Intent intAddPrecos = new android.content.Intent(getBaseContext(), badgears.storecheck.Controladores.ControladorColocarPrecos.class);
    intAddPrecos.putExtra("objCotacao", oCotacao);
    startActivity(intAddPrecos);
    finish();
}