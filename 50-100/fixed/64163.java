@org.jetbrains.annotations.NotNull
@org.jetbrains.annotations.Contract(pure = true)
private static java.lang.String libraryName(@org.jetbrains.annotations.NonNls
@org.jetbrains.annotations.NotNull
java.lang.String libName) {
    java.lang.String ___ = java.lang.System.getProperty("os.name");
    java.lang.String fileName;
    if (___.contains("Linux"))
        fileName = libName + ".so";
    else
        if (___.contains("Windows"))
            fileName = libName + ".dll";
        else
            fileName = libName + ".dylib";
        
    
    return new java.io.File(fileName).getAbsolutePath();
}