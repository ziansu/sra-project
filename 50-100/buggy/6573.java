private java.io.File getComponentFile(java.io.File pathFile, java.lang.String componentName) throws de.invation.code.toval.misc.wd.ProjectComponentException {
    try {
        return new java.io.File(java.lang.String.format(de.invation.code.toval.misc.wd.AbstractComponentContainer.componentFileFormat, pathFile.getCanonicalPath(), componentName, ".pnml"));
    } catch (java.io.IOException e) {
        throw new de.invation.code.toval.misc.wd.ProjectComponentException("Cannot compose component file.", e);
    }
}