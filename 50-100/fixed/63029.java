protected double getSpeed(final nl.tudelft.ti2806.riverrush.domain.entity.Team t) {
    int amountOnBoat = 0;
    int total = 0;
    for (nl.tudelft.ti2806.riverrush.domain.entity.AbstractAnimal anim : t.getAnimals().values()) {
        nl.tudelft.ti2806.riverrush.domain.entity.Animal animal = ((nl.tudelft.ti2806.riverrush.domain.entity.Animal) (anim));
        if (animal.isOnBoat()) {
            amountOnBoat++;
        }
        total++;
    }
    if (total == 0) {
        return 0.0;
    }
    return ((double) (amountOnBoat)) / ((double) (total));
}