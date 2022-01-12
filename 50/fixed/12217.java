public org.molgenis.data.Repository merge(java.util.List<org.molgenis.data.Repository> repositoryList, java.util.List<org.molgenis.data.AttributeMetaData> commonAttributes, org.molgenis.data.Repository mergedRepository) {
    return merge(repositoryList, commonAttributes, mergedRepository, 1000);
}