public void run() {
    int count = 0;
    while (count < 100) {
        try {
            hudson.model.FreeStyleProject project = hudson.plugins.disk_usage.integration.DiskUsageTestUtil.getProject(jenkins, "job");
            project.updateNextBuildNumber((107 + count));
            project = hudson.plugins.disk_usage.integration.DiskUsageTestUtil.prepareProjet(jenkins, project);
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.NullPointerException) {
                continue;
            }
            e.printStackTrace();
        } catch (java.lang.Error e) {
            e.printStackTrace();
        }
        count++;
    } 
    isFinished = true;
}