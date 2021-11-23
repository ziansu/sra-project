synchronized java.nio.file.Path getCaseDirectoryPath() {
    if (!(caseDirectoryPath.isEmpty())) {
        return java.nio.file.Paths.get(caseDirectoryPath);
    }else {
        return null;
    }
}