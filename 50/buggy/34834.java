public boolean createFile() {
    if (!(configFile.exists())) {
        saveFile(false);
        return true;
    }
    return false;
}