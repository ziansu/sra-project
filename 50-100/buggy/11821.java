@java.lang.Override
public com.udacity.gradle.joketeller.Joke loadInBackground() {
    int retryCount = 0;
    com.udacity.gradle.joketeller.Joke joke = loadJoke();
    if ((lastJoke) != null) {
        while ((joke.equals(lastJoke)) && (retryCount < (com.udacity.gradle.builditbigger.MainActivity.RETRY_LIMIT))) {
            timber.log.Timber.d("Got the same joke, looking for fresh material!");
            joke = loadJoke();
            retryCount++;
        } 
    }
    return joke;
}