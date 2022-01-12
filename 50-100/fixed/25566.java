@java.lang.Override
protected void doOnResponse(org.sonar.wsclient.services.Resource resource) {
    if ((resource != null) && (!(resource.getMeasures().isEmpty()))) {
        java.util.List<org.sonar.wsclient.services.Measure> measureList = resource.getMeasures();
        drilldownModel.addList("violations", measureList);
        drilldownModel.setOlderVersion(true);
        loadBenchmarkData();
    }else {
        drilldownController.onSelectedItemChanged(ViewComponents.INITIALIZE);
    }
}