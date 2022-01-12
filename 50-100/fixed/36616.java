@java.lang.Override
public void run() {
    java.util.ArrayList<java.io.File> files = new java.util.ArrayList<java.io.File>();
    files.add(new java.io.File(mainApp.getClass().getResource("/test_comparing2.txt").getFile()));
    mainApp.dataflowcontroller.importcontroller.addFiles(files);
}