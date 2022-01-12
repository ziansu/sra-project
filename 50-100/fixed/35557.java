public void create(company.gonapps.loghut.dto.TagDto tag) throws java.io.IOException {
    java.nio.file.Path tagPath = java.nio.file.Paths.get(((settingDao.getSetting("tag.directory")) + (tag.getLocalPath())));
    rrwl.writeLock().lock();
    try {
        java.nio.file.Files.createDirectories(tagPath.getParent());
        java.nio.file.Files.createFile(tagPath);
    } finally {
        rrwl.writeLock().unlock();
    }
}