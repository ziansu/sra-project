private void getJoke() {
    p.printStatus("Getting a random joke.");
    currentJoke = jokes.get(randIndex());
}