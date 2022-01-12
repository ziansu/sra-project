private void updateListKnownDirectories() {
    modelListKnownDirectories.clear();
    try {
        for (java.lang.String knownDirectory : properties.getKnownWorkingDirectories()) {
            try {
                modelListKnownDirectories.addElement(de.invation.code.toval.file.FileUtils.getDirName(knownDirectory));
                directories.add(knownDirectory);
            } catch (de.invation.code.toval.validate.ParameterException e) {
            }
        }
    } catch (java.lang.Exception e) {
        de.invation.code.toval.validate.ExceptionDialog.showException(this, "Working Directory Exception", new java.lang.Exception(("Cannot update list of known " + (properties.getWorkingDirectoryDescriptor().toLowerCase())), e), true);
    }
}