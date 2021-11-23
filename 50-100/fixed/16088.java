@java.lang.Override
public com.tbdcomputing.network.leaderelection.bully.state.BullyElectionState handleElection(org.json.JSONObject message) {
    double alpha = message.getDouble("alpha");
    java.lang.System.err.printf("Comparing alpha: %s to my alpha: %s\n", alpha, this.context.getAlpha());
    if (alpha >= (this.context.getAlpha())) {
        return transition(BullyElectionStateType.FOLLOWER);
    }else {
        sendSitdownMessage(message.getString("sender"));
        return this;
    }
}