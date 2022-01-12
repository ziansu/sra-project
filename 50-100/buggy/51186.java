@java.lang.Override
public boolean fireTorpedos(hu.bme.mit.spaceship.FiringMode firingMode) {
    boolean firingSuccess = false;
    switch (firingMode) {
        case SINGLE :
            tryToFire(wasPrimaryFiredLast);
            break;
        case ALL :
            if ((!(primaryTorpedoStore.isEmpty())) && (!(secondaryTorpedoStore.isEmpty()))) {
                firingSuccess = (primaryTorpedoStore.fire(1)) && (secondaryTorpedoStore.fire(1));
            }
            break;
    }
    return firingSuccess;
}