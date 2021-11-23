public domain.Folder save(domain.Folder folder) {
    org.springframework.util.Assert.notNull(folder);
    domain.Folder result;
    result = folderRepository.save(folder);
    return result;
}