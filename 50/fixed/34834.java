public boolean createFile() {
    if (!(configFile.exists())) {
        saveFile(true);
        return true;
    }
    return false;
}