public void moveRandom() {
    int random = Person.randomGenerator.nextInt(4);
    if (random == 1) {
        person.moveUp();
    }else
        if (random == 2) {
            person.moveDown();
        }else
            if (random == 3) {
                person.moveLeft();
            }else {
                person.moveRight();
            }
        
    
}