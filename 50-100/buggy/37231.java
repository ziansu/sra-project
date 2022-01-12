private void screenWrap() {
    if ((player.getX()) > 15) {
        player.setX(0);
    }else
        if ((player.getY()) > 15) {
            player.setY(0);
        }else
            if ((player.getX()) < 0) {
                player.setX(16);
            }else
                if ((player.getY()) < 0) {
                    player.setY(16);
                }
            
        
    
}