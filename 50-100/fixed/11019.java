@org.junit.Before
public void setUp() throws java.io.IOException {
    subTasks = new java.util.ArrayList<>();
    org.apache.commons.io.FileUtils.forceMkdir(new java.io.File(PATH_DOWNLOADED));
    mediaStorageClient = new eu.europeana.harvester.db.filesystem.FileSystemMediaStorageClientImpl(PATH_DOWNLOADED);
    slaveProcessor = new eu.europeana.harvester.cluster.slave.processing.SlaveProcessor(new eu.europeana.harvester.cluster.slave.processing.metainfo.MediaMetaInfoExtractor(PATH_COLORMAP), new eu.europeana.harvester.cluster.slave.processing.thumbnail.ThumbnailGenerator(PATH_COLORMAP), new eu.europeana.harvester.cluster.slave.processing.color.ColorExtractor(PATH_COLORMAP), mediaStorageClient);
    taskDocumentReference = new eu.europeana.harvester.cluster.slave.processing.ProcessingJobTaskDocumentReference(DocumentReferenceTaskType.UNCONDITIONAL_DOWNLOAD, "source-reference-1", subTasks);
}