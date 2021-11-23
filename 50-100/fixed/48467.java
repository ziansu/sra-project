private static void recursiveContainerTraversal(org.eclipse.cdt.core.model.ICContainer container, java.util.List<org.eclipse.cdt.core.model.ITranslationUnit> tuList, java.util.Set<java.lang.String> excludedFilesSet) throws org.eclipse.cdt.core.model.CModelException {
    for (org.eclipse.cdt.core.model.ICContainer inContainer : container.getCContainers()) {
        org.spg.refactoring.utilities.CdtUtilities.recursiveContainerTraversal(inContainer, tuList, excludedFilesSet);
    }
    for (org.eclipse.cdt.core.model.ITranslationUnit tu : container.getTranslationUnits()) {
        if (!(excludedFilesSet.contains(tu.getFile().getLocation().toString())))
            tuList.add(tu);
        
    }
}