@java.lang.Override
public int compareTo(com.kylinolap.job.JobInstance o) {
    return ((int) ((o.lastModified) - (this.lastModified)));
}