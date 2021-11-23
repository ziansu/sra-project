private void finishQuestion() {
    chat.sendMessage("Question is finished.");
    inQuestion = false;
    (currentSong)++;
    if ((currentSong) == (songs.size())) {
        finishGame();
    }
    scheduleStartQuestion();
}