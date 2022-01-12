@java.lang.Override
public java.util.List<grpc.Raft.Log> getLogs(long start, long end) {
    java.util.List<grpc.Raft.Log> logs = new java.util.ArrayList<>();
    for (long i = start; i < end; ++i) {
        logs.add(getLog(i));
    }
    return logs;
}