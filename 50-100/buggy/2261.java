public void finish() throws java.lang.InterruptedException {
    if (!(results.isEmpty())) {
        while (results.parallelStream().noneMatch(( a) -> a.isDone())) {
            harvester.app.harvesters.Harvester.logger.info("Waiting 5s for tasks to finish");
            java.lang.Thread.sleep(5000);
            results.removeIf(this::finished);
        } 
    }
    service.shutdown();
    driver.quit();
}