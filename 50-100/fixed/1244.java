@java.lang.Override
public void downloadFinished(org.alulab.uvaarena.webapi.DownloadTask task) {
    (finished)++;
    long len = 0;
    if (task instanceof org.alulab.uvaarena.webapi.DownloadString) {
        len = ((org.alulab.uvaarena.webapi.DownloadString) (task)).getResult().length();
    }
    java.lang.System.out.printf("%s | [%d]\n", task, len);
    java.lang.System.out.printf("Total Download Time : %.3f seconds\n", ((task.getDownloadTimeMillis()) / 1000.0));
}