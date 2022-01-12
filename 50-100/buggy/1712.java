public void nuovoFavorito(android.view.View v) {
    if ((li.size()) < 3) {
        android.content.Intent intent = new android.content.Intent(this, com.example.daniel.app0.NuovoPreferito.class);
        this.startActivityForResult(intent, com.example.daniel.app0.GestionePreferiti.FAVORITI_STATE);
    }else {
        android.widget.Toast.makeText(this, R.string.max_preferiti, Toast.LENGTH_SHORT);
    }
}