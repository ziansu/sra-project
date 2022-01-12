@java.lang.Override
public int compareTo(meteoroids.Meteoroids.utilities.highscores.Score score) {
    if ((this.points) == (score.points)) {
        return this.date.compareTo(score.date);
    }else
        if ((this.points) > (score.points)) {
            return -1;
        }else {
            return 1;
        }
    
}