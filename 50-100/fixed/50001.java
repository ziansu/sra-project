@java.lang.Override
public org.openflexo.technologyadapter.emf.model.EMFModel loadResourceData(org.openflexo.toolbox.IProgress progress) throws java.io.FileNotFoundException, org.openflexo.foundation.FlexoException, org.openflexo.foundation.resource.ResourceLoadingCancelledException {
    org.openflexo.technologyadapter.emf.model.io.EMFModelConverter converter = new org.openflexo.technologyadapter.emf.model.io.EMFModelConverter();
    org.openflexo.technologyadapter.emf.model.EMFModel resourceData = converter.convertModel(getMetaModelResource().getMetaModelData(), getEMFResource());
    setResourceData(resourceData);
    return resourceData;
}