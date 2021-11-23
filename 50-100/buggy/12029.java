@java.lang.Override
public fi.helsinki.cs.tmc.core.domain.Exercise call() throws java.lang.Exception {
    try {
        java.util.concurrent.Callable<java.lang.String> download = new fi.helsinki.cs.tmc.core.communication.http.HttpTasks().getForText(java.net.URI.create("localhost:3200/next.json"));
        java.lang.String json = download.call();
        fi.helsinki.cs.tmc.core.domain.Exercise ex = adaptiveExerciseParser.parseFromJson(json);
        java.util.concurrent.Callable<byte[]> b = getDownloadingExerciseZipTask(ex);
        return ex;
    } catch (java.lang.Exception ex) {
        return null;
    }
}