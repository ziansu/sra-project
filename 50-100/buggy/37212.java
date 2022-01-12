private java.util.Set<java.lang.String> buildVolumes(eu.openanalytics.services.AppService.ShinyApp app) {
    java.util.Set<java.lang.String> volumes = new java.util.HashSet<>();
    if ((app.getDockerVolumes()) != null) {
        for (java.lang.String vol : app.getDockerVolumes()) {
            volumes.add(vol);
        }
    }
    return volumes;
}