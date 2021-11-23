public boolean isManagerNodeActive() {
    com.amazonaws.services.ec2.model.Instance ins = null;
    try {
        ins = com.bgu.dsp.awsUtils.EC2Utils.getManagerInstance();
    } catch (com.amazonaws.AmazonClientException e) {
        com.bgu.dsp.main.LocalMachine.log.error("Ec2 call failed. Failed to check if manager is up.", e);
    }
    if (ins == null) {
        return false;
    }
    return true;
}