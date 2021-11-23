public insynctive.support.model.PerformanceConfiguration setScheduleDisabled() {
    insynctive.support.model.PerformanceConfiguration config = ((insynctive.support.model.PerformanceConfiguration) (openSession().get(insynctive.support.model.PerformanceConfiguration.class, new java.lang.Long(0))));
    config.setScheduleEnabled(false);
    update(config);
    return config;
}