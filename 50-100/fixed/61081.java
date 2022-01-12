public de.neemann.digital.core.element.ElementTypeDescription getDescription() throws java.io.IOException {
    if ((description) == null) {
        if (!(unique))
            throw new java.io.IOException(de.neemann.digital.lang.Lang.get("err_file_N0_ExistsTwiceBelow_N1", file.getName(), library.getRootFilePath()));
        
        try {
            description = library.importElement(file);
        } catch (java.io.IOException e) {
            descriptionImportError = true;
            throw e;
        }
        library.fireLibraryChanged(this);
    }
    return description;
}