public void setPlayerY(int playerY) {
    if (playerY > (((rows) * (height)) - (br.com.giorgetti.games.squareplatform.main.GamePanel.HEIGHT))) {
        this.playerY = ((rows) * (height)) - (br.com.giorgetti.games.squareplatform.main.GamePanel.HEIGHT);
    }else
        if (playerY < 0) {
            this.playerY = 0;
        }else {
            this.playerY = playerY;
        }
    
}