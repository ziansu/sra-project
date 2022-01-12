public void startGame() {
    soundPool.stop(notes[0]);
    soundPool.stop(notes[1]);
    soundPool.stop(notes[2]);
    soundPool.stop(notes[3]);
    Task = new com.alexhornick.simon.PlayActivity.playButton(0);
    Task.execute();
}