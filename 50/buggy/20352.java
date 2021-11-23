public synchronized org.eclipse.dltk.internal.core.UserLibrary getUserLibrary(java.lang.String libName, org.eclipse.dltk.core.IDLTKLanguageToolkit toolkit) {
    return ((org.eclipse.dltk.internal.core.UserLibrary) (this.userLibraries.get(org.eclipse.dltk.internal.core.UserLibraryManager.makeLibraryName(libName, toolkit))));
}