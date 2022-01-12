public org.eclipse.dltk.internal.core.UserLibrary getUserLibrary(java.lang.String libName, org.eclipse.dltk.core.IDLTKLanguageToolkit toolkit) {
    synchronized(userLibraries) {
        return userLibraries.get(org.eclipse.dltk.internal.core.UserLibraryManager.makeLibraryName(libName, toolkit));
    }
}