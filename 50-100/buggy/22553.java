@java.lang.Override
public boolean fireTorpedos(hu.bme.mit.spaceship.FiringMode firingMode) {
    boolean firingSuccess = false;
    switch (firingMode) {
        case SINGLE :
            firingSuccess = hu.bme.mit.spaceship.GT4500.fireSingle();
            break;
        case ALL :
            firingSuccess = (secondaryTorpedoStore.fire(secondaryTorpedoStore.getNumberOfTorpedos())) & (primaryTorpedoStore.fire(primaryTorpedoStore.getNumberOfTorpedos()));
            break;
        default :
            throw new java.lang.Exception("Die :)");
    }
    return firingSuccess;
}