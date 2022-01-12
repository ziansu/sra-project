public void updateHighscores(java.util.List<it.polimi.guardian.authorityapp.Highscore> jObjList) {
    highscoresList.clear();
    for (it.polimi.guardian.authorityapp.Highscore h : jObjList) {
        highscoresList.add(h);
    }
    java.util.Collections.sort(highscoresList);
    this.refresh();
}