private net.sourceforge.seqware.pipeline.workflowV2.model.Job setSynapseStatus(net.sourceforge.seqware.pipeline.workflowV2.model.Job previousJob, java.lang.String status, java.lang.String workflowID) {
    net.sourceforge.seqware.pipeline.workflowV2.model.Job setSynapseStatusJob = this.getWorkflow().createBashJob(("set_synapse_status_" + status));
    setSynapseStatusJob.getCommand().addArgument(((("cd $PCAWG_DIR && /workflows/gitroot/pcawg_tools/scripts/pcawg_wf_gen.py set " + status) + " ") + workflowID));
    setSynapseStatusJob.addParent(setSynapseStatusJob);
    return setSynapseStatusJob;
}