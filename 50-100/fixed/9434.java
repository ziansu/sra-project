@java.lang.Override
public hudson.model.ParameterDefinition copyWithDefaultValue(hudson.model.ParameterValue defaultValue) {
    if (defaultValue instanceof com.cloudbees.plugins.credentials.CredentialsParameterValue) {
        com.cloudbees.plugins.credentials.CredentialsParameterValue value = ((com.cloudbees.plugins.credentials.CredentialsParameterValue) (defaultValue));
        return new com.cloudbees.plugins.credentials.CredentialsParameterDefinition(getName(), getDescription(), value.getValue(), getCredentialType(), isRequired());
    }
    return this;
}