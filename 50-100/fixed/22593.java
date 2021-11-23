@org.testng.annotations.BeforeClass
public void cleanWorkingDirectory() {
    java.io.File file = new java.io.File(dir);
    java.io.File[] files = file.listFiles();
    for (int i = 0; i < (files.length); i++) {
        java.io.File f1 = files[i];
        f1.delete();
    }
}