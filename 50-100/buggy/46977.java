public java.io.File findPackageDirectory() throws java.io.FileNotFoundException {
    if ((in.blazingk.blz.packagemanager.ImportPackageInstruction.packageDirectory) == null) {
        java.io.File dir = getRunningDirectory();
        for (java.io.File f : listFileTree(dir)) {
            if (f.getName().toLowerCase().equals("packages")) {
                in.blazingk.blz.packagemanager.ImportPackageInstruction.packageDirectory = f;
                return f;
            }
        }
        throw new java.io.FileNotFoundException(("Could not find Packages directory in " + dir));
    }else {
        return in.blazingk.blz.packagemanager.ImportPackageInstruction.packageDirectory;
    }
}