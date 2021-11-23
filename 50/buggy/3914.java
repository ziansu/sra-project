public void deleteApkWorkingDirectory() throws java.io.IOException {
    deleteApkDecompiledDirectory();
    deleteApkUnzipedDirectory();
    sk.styk.martin.bakalarka.files.FileUtils.deleteDirectory(workingDir);
}