public com.squareup.spoon.SpoonRunner.Builder setInitScript(java.io.File initScript) {
    com.google.common.base.Preconditions.checkNotNull(initScript, "Script path not specified.");
    com.google.common.base.Preconditions.checkArgument(initScript.exists(), ("Script path does not exist " + (initScript.getAbsolutePath())));
    this.initScript = initScript;
    return this;
}