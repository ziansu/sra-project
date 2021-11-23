@retrofit.http.GET(value = "/decks/")
void getRandomDeck(@retrofit.http.Query(value = "random")
boolean randomKey, @retrofit.http.Query(value = "random")
boolean flashcardCountKey, retrofit.Callback<java.util.List<com.blstream.studybox.model.database.Decks>> cb);