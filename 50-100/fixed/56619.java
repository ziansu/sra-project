protected void updateFields() {
    configuration.setText(repositoryModel.getConfigurationPath());
    repository.setText(repositoryModel.getRepositoryPath());
    username.setText(repositoryModel.getUsername());
    password.setText(repositoryModel.getPassword());
    updateNamespacesField(repositoryModel);
}