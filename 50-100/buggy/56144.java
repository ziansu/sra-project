private void paddleCollide(Tennis game) {
    if (boundingBox.intersects(game.player.boundingBox)) {
        velocityX = speed;
        this.intersectionHits += 1;
        if (((this.intersectionHits) % 3) == 0)
            game.playerScore += 1;
        
    }else
        if (boundingBox.intersects(game.compplayer.boundingBox)) {
            velocityX = -(speed);
        }
    
}