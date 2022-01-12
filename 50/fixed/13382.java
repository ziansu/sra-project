private void checkComponentType(com.orientechnologies.orient.core.storage.impl.local.statistic.OSessionStoragePerformanceStatistic.Component component, com.orientechnologies.orient.core.storage.impl.local.statistic.OSessionStoragePerformanceStatistic.ComponentType expected) {
    if (!(component.type.equals(expected)))
        throw new java.lang.IllegalStateException(((("Invalid component type , required " + expected) + " but found ") + (component.type)));
    
}