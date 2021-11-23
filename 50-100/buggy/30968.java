public boolean topTenCheck(long points) {
    loadScoreFile();
    java.util.Collections.sort(scores);
    for (meteoroids.Meteoroids.utilities.highscores.Score s : scores)
        java.lang.System.out.println(s);
    
    if (((scores) == null) || ((scores.size()) == 0)) {
        return true;
    }
    if ((scores.size()) < 10) {
        return true;
    }else {
        return points > (scores.get(9).getPoints());
    }
}