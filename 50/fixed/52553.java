private void getRepository() {
    configureSessionFactory();
    java.util.List<org.apache.chemistry.opencmis.client.api.Repository> repositories = sessionFactory.getRepositories(parameters, null, authenticationProvider, null, null);
    this.repository = repositories.get(0);
}