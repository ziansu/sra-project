public void add(com.google.gson.JsonArray cardsJson) {
    for (int i = 0; i < (cardsJson.size()); i++) {
        cards.add(new org.leanpoker.player.Card(cardsJson.getAsJsonObject().get("suit").getAsString(), cardsJson.getAsJsonObject().get("rank").getAsString()));
    }
}