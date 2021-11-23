@org.jetbrains.annotations.Nullable
public static com.intellij.json.psi.JsonFile getComposerManifest(com.intellij.psi.PsiDirectory currentDirectory) {
    if (currentDirectory == null) {
        return null;
    }
    com.intellij.json.psi.JsonFile composerFile;
    do {
        composerFile = de.vette.idea.neos.util.ComposerUtil.getComposerManifestInDirectory(currentDirectory);
        currentDirectory = currentDirectory.getParentDirectory();
    } while (((composerFile == null) && (currentDirectory != null)) && (!(currentDirectory.equals(currentDirectory.getProject().getBaseDir()))) );
    return composerFile;
}