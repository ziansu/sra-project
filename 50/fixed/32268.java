public java.lang.String getRandomJoke() {
    return jokes.get(rand.nextInt(jokes.size()));
}