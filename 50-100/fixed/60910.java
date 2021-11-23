public void lift(int liftDirection) {
    switch (liftDirection) {
        case 1 :
            lift(com.edinarobotics.zephyr.parts.CollectorComponents.DEFAULT_DEPLOY_MULTIPLIER);
            break;
        case -1 :
            lift(((-1) * (com.edinarobotics.zephyr.parts.CollectorComponents.DEFAULT_DEPLOY_MULTIPLIER)));
            break;
        default :
            lift(0);
            break;
    }
}