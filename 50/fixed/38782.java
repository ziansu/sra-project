@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.thefe.newsmartkedex.PokemonDetails.class);
    i.putExtra("id", ((pokeID) - 1));
    startActivity(i);
    return true;
}