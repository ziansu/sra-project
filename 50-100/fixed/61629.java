public void processMessage(game.User u, java.lang.String s) {
    if (!(inQuestion)) {
        return ;
    }
    if (s.equals(songs.get(currentSong).name)) {
        chat.sendMessage((("Correct, " + (u.firstName)) + "!"));
        gameTimer.cancel();
        finishQuestion();
    }else {
        chat.sendMessage((("Incorrect, " + (u.firstName)) + "!"));
    }
}