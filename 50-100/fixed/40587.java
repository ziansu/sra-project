public void moveRandom() {
    int random = Person.randomGenerator.nextInt(4);
    if (random == 1) {
        this.moveUp();
    }else
        if (random == 2) {
            this.moveDown();
        }else
            if (random == 3) {
                this.moveLeft();
            }else {
                this.moveRight();
            }
        
    
}