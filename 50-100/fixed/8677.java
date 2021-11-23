@java.lang.Override
public void writeTo(org.elasticsearch.common.io.stream.StreamOutput out) throws java.io.IOException {
    super.writeTo(out);
    int numJobs = toKill.size();
    out.writeVInt(numJobs);
    for (java.util.UUID job : toKill) {
        out.writeLong(job.getMostSignificantBits());
        out.writeLong(job.getLeastSignificantBits());
    }
}