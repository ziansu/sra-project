public void addSpeed(nl.tudelft.scrumbledore.LevelElement el) {
    if (el != null) {
        el.getPosition().sum(el.getSpeed());
    }
}