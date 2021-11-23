public static org.apache.airavata.gfac.core.states.GfacExperimentState getZKExperimentState(org.apache.airavata.gfac.core.utils.ZooKeeper zk, org.apache.airavata.gfac.core.context.JobExecutionContext jobExecutionContext) throws java.lang.InterruptedException, org.apache.airavata.common.exception.ApplicationSettingsException, org.apache.airavata.gfac.core.utils.KeeperException {
    java.lang.String expState = org.apache.airavata.common.utils.AiravataZKUtils.getExpState(zk, jobExecutionContext.getExperimentID());
    if ((expState == null) || (expState.isEmpty())) {
        return org.apache.airavata.gfac.core.states.GfacExperimentState.UNKNOWN;
    }
    return org.apache.airavata.gfac.core.states.GfacExperimentState.valueOf(expState);
}