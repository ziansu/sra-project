public de.uniba.wiai.lspi.chord.data.ID getTarget() {
    de.uniba.wiai.lspi.chord.data.ID target = null;
    switch (plan) {
        case WEAKEST :
            target = weakestPlan();
            break;
        default :
            target = randomPlan();
            break;
    }
    logger.info((target + " is the next target"));
    return target;
}