public void delete() {
    com.benz.usecase.domain.DomainRegistry.resultFileRepository().delete(this.getId());
}