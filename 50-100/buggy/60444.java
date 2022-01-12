public void setEmbeddedProfile() throws java.io.IOException, java.lang.InterruptedException {
    au.com.rayh.FilePath[] folders = this.resourcesPath.list("**/*.mobileprovision");
    if ((folders.length) == 0) {
        throw new au.com.rayh.AbortException("Provisioning profile not found");
    }
    au.com.rayh.FilePath profilePath = folders[0];
    profilePath.copyTo(binaryPath.child(au.com.rayh.CodeSignWrapper.PROFILE_FILE));
}