public boolean checkNewHighScore(int category, int score) {
    android.util.Log.d("checkNewHighScore", "checking if new high score");
    int offset = (category - 1) * 5;
    for (int i = 0; i < 5; i++) {
        if ((scores[(offset + i)].getScore()) < score)
            return true;
        
    }
    return false;
}