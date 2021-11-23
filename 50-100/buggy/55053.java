public boolean hasCodeSignedFrameworks() {
    au.com.rayh.FilePath frameworkFolder = this.binaryPath.child("Frameworks");
    try {
        for (au.com.rayh.FilePath framework : frameworkFolder.list()) {
            if (framework.child(au.com.rayh.CodeSignWrapper.SIGNATURE_FILE).exists()) {
                return true;
            }
        }
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        return false;
    }
    return false;
}