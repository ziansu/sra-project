public java.util.Collection<domain.Folder> save(java.util.Collection<domain.Folder> folder) {
    org.springframework.util.Assert.notNull(folder);
    java.util.Collection<domain.Folder> result;
    result = new java.util.ArrayList<domain.Folder>();
    for (domain.Folder a : folder) {
        result.add(folderRepository.save(a));
    }
    return result;
}