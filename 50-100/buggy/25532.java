public void setrunoffC(cisc275.game.model.Water health) {
    int h = this.health;
    if ((h > (-50)) && (h <= 0)) {
        this.runoffC = java.awt.Color.CYAN;
    }else
        if ((h > 0) && (h <= 50)) {
            this.runoffC = java.awt.Color.YELLOW;
        }else
            if ((h > 50) && (h <= 100)) {
                this.runoffC = java.awt.Color.GREEN;
            }
        
    
}