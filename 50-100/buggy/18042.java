public final void setScore(final int points) {
    score += points;
    if ((score) != 0) {
        sem.group47.audio.AudioPlayer.play("bubblePop");
    }
    sem.group47.main.Log.info("Player Action", (("Player received " + points) + " points"));
    if ((score) >= (extraLive)) {
        java.lang.System.out.println("true");
        sem.group47.audio.AudioPlayer.play("extraLife");
        (lives)++;
        extraLive += 300;
        sem.group47.main.Log.info("Player Action", "Player received a new life");
    }
}