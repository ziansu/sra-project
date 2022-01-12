@java.lang.Override
public boolean shouldEat(oortcloud.hungryanimals.entities.capability.ICapabilityHungryAnimal cap) {
    return ((cap.getHunger()) + (min)) < (cap.getMaxHunger());
}