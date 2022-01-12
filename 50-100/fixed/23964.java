public static com.google.gson.JsonArray shuffled(com.google.gson.JsonArray jsonArray) {
    com.google.gson.JsonArray shuffledArray = new com.google.gson.JsonArray();
    shuffledArray.addAll(jsonArray);
    for (int i = (shuffledArray.size()) - 1; i > 0; i--) {
        int index = org.smalldatalab.northwell.impulse.SDL.CTFHelpers.rnd.nextInt((i + 1));
        com.google.gson.JsonElement a = shuffledArray.get(index);
        shuffledArray.set(index, shuffledArray.get(i));
        shuffledArray.set(i, a);
    }
    return shuffledArray;
}