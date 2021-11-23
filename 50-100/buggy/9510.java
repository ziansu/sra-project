public void checkAllowsDeployment(org.carlspring.strongbox.storage.repository.Repository repository) throws org.carlspring.strongbox.storage.ArtifactStorageException {
    if (((!(repository.allowsDeployment())) && (!(RepositoryTypeEnum.GROUP.getType().equals(repository.getType())))) && (!(RepositoryTypeEnum.PROXY.getType().equals(repository.getType())))) {
        throw new org.carlspring.strongbox.storage.ArtifactStorageException((("Deployment of artifacts to " + (repository.getType())) + " repositories is not allowed!"));
    }
}