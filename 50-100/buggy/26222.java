@java.lang.Override
public java.lang.Void call() throws com.microsoftopentechnologies.intellij.helpers.azure.AzureCmdException {
    try {
        com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.getManager().uploadBlobFileContent(storageAccount, blobContainer, (path + (selectedFile.getName())), bufferedInputStream, callable, (1024 * 1024), selectedFile.length());
    } finally {
        try {
            bufferedInputStream.close();
        } catch (java.io.IOException ignored) {
        }
    }
    return null;
}