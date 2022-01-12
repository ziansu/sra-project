private static java.util.ArrayList<java.lang.String> runPythonScript(java.lang.String scriptLocation, java.lang.String[] arguments) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] strArr = new java.lang.String[(arguments.length) + 1];
    strArr[0] = scriptLocation;
    for (int i = 0; i < (arguments.length); i++)
        strArr[(i + 1)] = arguments[i];
    
    return main.EarthModellingDaemon.runExecutable(FileLocations.PYTHON_EXECUTABLE_BINARY_LOCATION, strArr);
}