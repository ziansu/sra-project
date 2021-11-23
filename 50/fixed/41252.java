public com.squareup.spoon.SpoonRunner.Builder setInitScript(java.io.File initScript) {
    if (initScript != null) {
        com.google.common.base.Preconditions.checkArgument(initScript.exists(), ("Script path does not exist " + (initScript.getAbsolutePath())));
    }
    this.initScript = initScript;
    return this;
}