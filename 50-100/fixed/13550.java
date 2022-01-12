private void resetWorkingFiles(java.io.File workingChanges, java.io.File tempPrevChanges, java.io.File tempModelVersion) {
    try {
        workingChanges.delete();
        workingChanges.createNewFile();
        tempPrevChanges.delete();
        if (tempModelVersion != null) {
            tempModelVersion.delete();
        }
    } catch (java.io.IOException e) {
        throw new uk.ac.soton.simulation.jsit.core.VersionControlException(("Failed to clear up working changes files and remove " + "temp backups but commit succeeded"));
    }
}