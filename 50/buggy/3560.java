@org.springframework.context.annotation.Bean
org.molgenis.data.semanticsearch.repository.TagRepository tagRepository() {
    org.molgenis.data.Repository<org.molgenis.data.meta.model.Tag> repo = dataService.getRepository(org.molgenis.data.meta.model.TagMetaData.TAG, org.molgenis.data.meta.model.Tag.class);
    return new org.molgenis.data.semanticsearch.repository.TagRepository(repo, idGenerator, tagFactory);
}