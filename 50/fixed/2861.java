public insynctive.support.model.PerformanceConfiguration setScheduleEnabled() {
    insynctive.support.model.PerformanceConfiguration config = ((insynctive.support.model.PerformanceConfiguration) (openSession().get(insynctive.support.model.PerformanceConfiguration.class, new java.lang.Long(0))));
    config.setScheduleEnabled(true);
    update(config);
    return config;
}