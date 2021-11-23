@java.lang.Override
protected float eval(java.util.List<com.github.infosimulators.events.Event> events) {
    if (events.isEmpty())
        return 0.5F;
    
    float p = 0;
    for (com.github.infosimulators.events.Event event : events) {
        switch (event.getType()) {
            case SIMU_PLANET_LEFT :
                p += 5;
                break;
            case SIMU_PLANET_COLLISION :
                p += 1;
                break;
            case SIMU_PLANET_UNITE :
                p += 3;
                break;
            case SIMU_END :
                p += 20;
                break;
        }
    }
    return p;
}