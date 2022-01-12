private version2.prototype.EastWebUI.ProgressUI.ProjectProgress.ProgressValue GetAverage(java.util.TreeMap<java.lang.String, java.lang.Double> TotalProgress) {
    double total = 0;
    java.util.Iterator<java.lang.String> pluginIt = TotalProgress.keySet().iterator();
    while (pluginIt.hasNext()) {
        total += TotalProgress.get(pluginIt.next());
    } 
    return new version2.prototype.EastWebUI.ProgressUI.ProjectProgress.ProgressValue(((int) (total)), total);
}