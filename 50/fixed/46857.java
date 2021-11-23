@java.lang.Override
public int compareTo(entities.Job other) {
    return (other.jobPriority) == (this.jobPriority) ? ((int) ((other.jobID) - (this.jobID))) : (other.jobPriority) - (this.jobPriority);
}