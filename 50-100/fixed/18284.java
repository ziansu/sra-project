public void start(org.universAAL.middleware.container.ModuleContext ctxt) throws java.lang.Exception {
    eu.city4ageproject.delivery.ProjectActivator.context = ctxt;
    org.universAAL.middleware.container.utils.LogUtils.logDebug(eu.city4ageproject.delivery.ProjectActivator.context, getClass(), "start", "Starting.");
    servlet = new eu.city4ageproject.delivery.HTTPService(eu.city4ageproject.delivery.ProjectActivator.context);
    servlet.register();
    org.universAAL.middleware.container.utils.LogUtils.logDebug(eu.city4ageproject.delivery.ProjectActivator.context, getClass(), "start", "Started.");
}