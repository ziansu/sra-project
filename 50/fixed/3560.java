@org.springframework.context.annotation.Bean
org.molgenis.data.semanticsearch.repository.TagRepository tagRepository() {
    return new org.molgenis.data.semanticsearch.repository.TagRepository(dataService, idGenerator, tagFactory);
}