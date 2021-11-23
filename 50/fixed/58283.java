@java.lang.Override
public int compareTo(com.kylinolap.job.JobInstance o) {
    return (o.lastModified) < (this.lastModified) ? -1 : (o.lastModified) > (this.lastModified) ? 1 : 0;
}