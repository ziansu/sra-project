@org.apache.hadoop.classification.InterfaceAudience.Private
public void rampDownReduces(int rampDown) {
    while (rampDown > 0) {
        org.apache.hadoop.mapreduce.v2.app.rm.ContainerRequest request = scheduledRequests.removeReduce();
        if (request == null) {
            return ;
        }
        pendingReduces.add(request);
        rampDown--;
    } 
}