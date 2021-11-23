private void getData() {
    com.example.nhan.pokemonquizzapp1.database.DatabaseAsset databaseAsset = com.example.nhan.pokemonquizzapp1.database.DatabaseAsset.getInstance(this);
    databaseAsset.open();
    pokemonList = databaseAsset.getDataPokemon();
    databaseAsset.close();
}