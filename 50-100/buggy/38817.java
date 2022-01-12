private java.io.File getDeployableFile(java.io.File curationFile) {
    java.io.File toDeploy = getDeployedFastaFile(curationFile);
    edu.mayo.mprc.utilities.FileUtilities.ensureFolderExists(curationFile.getParentFile());
    if (!(toDeploy.exists())) {
        edu.mayo.mprc.utilities.FileUtilities.copyFile(curationFile, toDeploy, true);
    }
    return toDeploy;
}