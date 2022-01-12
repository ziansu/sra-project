@java.lang.Override
public boolean fireTorpedos(hu.bme.mit.spaceship.FiringMode firingMode) {
    boolean firingSuccess = false;
    switch (firingMode) {
        case SINGLE :
            firingSuccess = fireSingle();
            break;
        case ALL :
            firingSuccess = (secondaryTorpedoStore.fire(secondaryTorpedoStore.getNumberOfTorpedos())) & (primaryTorpedoStore.fire(primaryTorpedoStore.getNumberOfTorpedos()));
            break;
    }
    return firingSuccess;
}