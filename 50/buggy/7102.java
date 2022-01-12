@java.lang.Override
public java.util.concurrent.Future<java.io.File> _submit(com.google.gson.JsonObject submission) throws java.lang.Exception {
    java.io.File toolkitRoot = super._submit(submission).get();
    return com.ibm.streamsx.topology.internal.context.remote.ZippedToolkitRemoteContext.createCodeArchive(toolkitRoot, submission);
}