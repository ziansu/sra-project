public boolean saveModel(org.eclipse.emf.ecore.EObject model, java.lang.String filename, java.lang.String cwd, org.franca.core.framework.IImportedModelProvider importedModels) {
    java.lang.System.out.println((((("Saving Franca model: root file is " + filename) + ", ") + (importedModels != null ? importedModels.getNModels() : 0)) + " imported models."));
    if (!(initResourcesRecursively(model, filename, cwd, importedModels)))
        return false;
    
    return saveModelRecursively(model, filename, cwd);
}