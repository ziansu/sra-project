public static void main(java.lang.String[] args) throws java.io.IOException {
    com.transgressoft.randomfilecopier.RandomFileCopier.parseArguments();
    if (com.transgressoft.randomfilecopier.RandomFileCopier.validArguments()) {
        com.transgressoft.randomfilecopier.RandomFileCopier copier = new com.transgressoft.randomfilecopier.RandomFileCopier(com.transgressoft.randomfilecopier.RandomFileCopier.sourceFile.toString(), com.transgressoft.randomfilecopier.RandomFileCopier.targetFile.toString(), com.transgressoft.randomfilecopier.RandomFileCopier.maxFilesCmd);
        copier.setVerbose(com.transgressoft.randomfilecopier.RandomFileCopier.verboseCmd);
        copier.setFilterExtensions(com.transgressoft.randomfilecopier.RandomFileCopier.extensionsCmd);
        if ((com.transgressoft.randomfilecopier.RandomFileCopier.maxBytesCmd) > 0)
            copier.setMaxBytesToCopy(com.transgressoft.randomfilecopier.RandomFileCopier.maxBytesCmd);
        
        copier.randomCopy();
    }
}