@java.lang.Override
protected void process(com.artemis.utils.Bag<com.artemis.BaseSystem> systems) {
    java.lang.Object[] systemsData = systems.getData();
    for (int i = 0, s = systems.size(); s > i; i++) {
        if (disabled.get(i))
            continue;
        
        com.artemis.BaseSystem system = ((com.artemis.BaseSystem) (systemsData[i]));
        system.process();
        updateEntityStates();
    }
}