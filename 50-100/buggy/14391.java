public org.gradle.test.fixtures.file.TestFile[] listFiles() {
    java.io.File[] children = super.listFiles();
    org.gradle.test.fixtures.file.TestFile[] files = new org.gradle.test.fixtures.file.TestFile[children.length];
    for (int i = 0; i < (children.length); i++) {
        java.io.File child = children[i];
        files[i] = new org.gradle.test.fixtures.file.TestFile(child);
    }
    return files;
}