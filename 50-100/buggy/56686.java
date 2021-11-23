private static java.lang.String getNormalServices(br.com.curiousguy.aerocar.model.WorkSession workSession) {
    java.lang.String services = "";
    if (workSession.hasService()) {
        services = services.concat(workSession.getService().getName());
    }
    if (workSession.hasWash()) {
        services = services.concat((" + " + (workSession.getWash().getName())));
    }
    return services;
}