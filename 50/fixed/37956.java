@org.springframework.web.bind.annotation.GetMapping(value = "/projects/{id}")
reactor.core.publisher.Mono<com.idugalic.domain.project.Project> findById(@org.springframework.web.bind.annotation.PathVariable
java.lang.String id) {
    com.idugalic.web.project.ProjectController.LOG.info("Project - FindById");
    return this.projectRepository.findById(id);
}