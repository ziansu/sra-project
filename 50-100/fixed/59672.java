@java.lang.Override
public boolean isStarving(int actualDiet, zoo.animal.feeding.FeedingAttributes feedingAt, zoo.paddock.IPaddock paddock, java.util.List<java.lang.Integer> specieDiet, java.util.List<zoo.animalKeeper.AnimalKeeper> keepers) {
    if ((feedingAt.getFastDays()) == 7) {
        return true;
    }
    if (!(specieDiet.contains(actualDiet))) {
        return true;
    }
    for (zoo.animalKeeper.AnimalKeeper keeper : keepers) {
        if (keeper.isMakingFeedingInThePaddock(paddock)) {
            return false;
        }
    }
    return true;
}