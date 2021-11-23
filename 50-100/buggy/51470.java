private void GameOverJudge() {
    if ((random_flag) && ((GameOver) <= 14)) {
        RandomView();
        RandomView();
        random_flag = false;
    }else
        if ((random_flag) && ((GameOver) == 15)) {
            RandomView();
            random_flag = false;
        }else
            if ((gameover_flag) && ((GameOver) == 16)) {
                GameOverDialog();
            }
        
    
}