public static java.lang.Object getPollingSemaphore(java.lang.String unit) {
    synchronized(com.doogetha.buildtool.server.webapp.rest.service.JobExeListResource.POLLING_NOTIFIERS) {
        java.lang.Object semaphore = com.doogetha.buildtool.server.webapp.rest.service.JobExeListResource.POLLING_NOTIFIERS.get(unit);
        if (semaphore == null) {
            semaphore = new java.lang.Object();
            com.doogetha.buildtool.server.webapp.rest.service.JobExeListResource.POLLING_NOTIFIERS.put(unit, semaphore);
        }
        return semaphore;
    }
}