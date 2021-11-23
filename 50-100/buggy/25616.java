@java.lang.Override
public int compareTo(meteoroids.Meteoroids.utilities.highscores.Score score) {
    if ((this.points) == (score.points)) {
        return 0;
    }else
        if ((this.points) > (score.points)) {
            return -1;
        }else {
            return 1;
        }
    
}