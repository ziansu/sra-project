public com.epam.reportportal.service.Launch startLaunch(com.epam.ta.reportportal.ws.model.launch.StartLaunchRQ rq) {
    if (!(parameters.getEnable())) {
        return Launch.NOOP_LAUNCH;
    }
    com.epam.reportportal.service.LaunchImpl service = new com.epam.reportportal.service.LaunchImpl(rpClient, parameters);
    service.startLaunch(rq);
    return service;
}