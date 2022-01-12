private void startGame(java.lang.String cats) {
    currentSong = 0;
    inQuestion = false;
    chat.sendMessage("Игра загружается, осталось совсем немного...");
    songs = generateSongs(cats);
    if ((songs) == null) {
        chat.finishGame();
        return ;
    }
    chat.sendMessage("Игра готова!");
    scheduleStartQuestion();
}