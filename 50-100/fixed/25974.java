public void setPlayerY(int playerY) {
    if (playerY > ((rows) * (height))) {
        this.playerY = (rows) * (height);
    }else
        if (playerY < 0) {
            this.playerY = 0;
        }else {
            this.playerY = playerY;
        }
    
}