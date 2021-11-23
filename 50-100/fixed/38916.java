@java.lang.Override
public java.util.concurrent.Future<java.io.File> _submit(com.google.gson.JsonObject submission) throws java.lang.Exception {
    preSubmit(submission);
    com.google.gson.JsonObject deploy = com.ibm.streamsx.topology.internal.gson.GsonUtilities.object(submission, "deploy");
    com.google.gson.JsonObject service = com.ibm.streamsx.topology.internal.streaminganalytics.VcapServices.getVCAPService(deploy);
    java.util.concurrent.Future<java.io.File> archive = super._submit(submission);
    doSubmit(submission, service, archive.get());
    return postSubmit(submission, archive);
}