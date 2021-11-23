private boolean commitModifiesCFile(org.repodriller.domain.Commit commit) {
    for (org.repodriller.domain.Modification m : commit.getModifications()) {
        java.lang.String fileName = m.getFileName();
        if ((fileName.endsWith(".c")) || (fileName.endsWith(".C"))) {
            return true;
        }
    }
    return false;
}