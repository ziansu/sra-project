public void clean() {
    java.util.Iterator<org.qohs.dogrunner.gameobjects.mainsurvival.Body> iterator = carArray.iterator();
    while (iterator.hasNext()) {
        org.qohs.dogrunner.gameobjects.mainsurvival.Body car = iterator.next();
        if (((car.getPosition().x) + ((carWidth) / 2)) < 0) {
            iterator.remove();
            world.destroyBody(car);
            dogRunner.userProfile.score += 10;
        }
    } 
}