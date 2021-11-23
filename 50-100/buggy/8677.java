@java.lang.Override
public void writeTo(org.elasticsearch.common.io.stream.StreamOutput out) throws java.io.IOException {
    super.writeTo(out);
    int numJobs = toKill.size();
    out.writeVInt(numJobs);
    for (int i = 0; i < numJobs; i++) {
        java.util.UUID job = toKill.get(i);
        out.writeLong(job.getMostSignificantBits());
        out.writeLong(job.getLeastSignificantBits());
    }
}