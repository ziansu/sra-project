@java.lang.Override
public java.util.List<org.ednovo.gooru.core.api.model.ResourceInstance> listCollectionResourceInstances(java.util.Map<java.lang.String, java.lang.String> filters) {
    return this.getLearnguideRepository().listCollectionResourceInstance(filters);
}