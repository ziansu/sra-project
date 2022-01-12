@java.lang.Override
protected void process(com.artemis.utils.Bag<com.artemis.BaseSystem> systems) {
    com.artemis.BaseSystem[] systemsData = systems.getData();
    for (int i = 0, s = systems.size(); s > i; i++) {
        if (disabled.get(i))
            continue;
        
        systemsData[i].process();
        updateEntityStates();
    }
}