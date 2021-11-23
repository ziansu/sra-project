private static java.util.List<java.lang.String> filesThatHasnoPhysicalReference(java.util.List<java.lang.String> allFilesList, java.util.List<uk.ac.ebi.metabolights.repository.model.Assay> assays) {
    java.util.List<java.lang.String> noPhysicalReference = new java.util.ArrayList<>();
    java.util.HashSet<java.lang.String> filesThatAreReferencedInAssays = uk.ac.ebi.metabolights.repository.utils.validation.groups.AssayValidations.getFilesThatAreReferencedInAssays(assays, false);
    for (java.lang.String uniqueFileName : filesThatAreReferencedInAssays) {
        if (!(uk.ac.ebi.metabolights.repository.utils.validation.Utilities.match(uniqueFileName, allFilesList))) {
            noPhysicalReference.add(uniqueFileName);
        }
    }
    return noPhysicalReference;
}