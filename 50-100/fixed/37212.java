private java.util.List<java.lang.String> buildVolumes(eu.openanalytics.services.AppService.ShinyApp app) {
    java.util.List<java.lang.String> volumes = new java.util.ArrayList<>();
    if ((app.getDockerVolumes()) != null) {
        for (java.lang.String vol : app.getDockerVolumes()) {
            volumes.add(vol);
        }
    }
    return volumes;
}