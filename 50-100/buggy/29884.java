@org.springframework.context.annotation.Bean(name = de.weltraumschaf.maconha.service.ScanService.JOB_NAME)
public org.springframework.batch.core.Job scanJob() {
    de.weltraumschaf.maconha.service.scan.ScanBatchConfiguration.LOGGER.debug("Create {} bean.", ScanService.JOB_NAME);
    return jobs.get(ScanService.JOB_NAME).incrementer(new org.springframework.batch.core.launch.support.RunIdIncrementer()).listener(listener).flow(findFilesStep()).next(filterSeenFilesStep()).next(metaDataExtractionStep()).end().build();
}