public void scheduleTarget(java.lang.Object target) {
    logger.debug("Scheduling target object of type {}", target.getClass().getName());
    if (target != null) {
        java.lang.Class<?> clazz = target.getClass();
        for (java.lang.reflect.Method method : clazz.getMethods()) {
            com.jensfendler.ninjaquartz.annotations.QuartzSchedule quartzSchedule = method.getAnnotation(com.jensfendler.ninjaquartz.annotations.QuartzSchedule.class);
            if (quartzSchedule != null) {
                scheduleMethod(target, method, quartzSchedule);
            }
        }
    }
}