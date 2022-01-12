public void add(com.google.gson.JsonArray cardsJson) {
    for (int i = 0; i < (cardsJson.size()); i++) {
        cards.add(new org.leanpoker.player.Card(cardsJson.get(i).getAsJsonObject().get("suit").getAsString(), cardsJson.get(1).getAsJsonObject().get("rank").getAsString()));
    }
}