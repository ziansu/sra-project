@java.lang.Override
public void open(int taskNumber, int numTasks) throws java.io.IOException {
    if ((this.taskNumber) != (-1)) {
        throw new java.lang.IllegalStateException(("This output is already/still open for task" + (this.taskNumber)));
    }
    if (de.zib.sfs.analysis.io.SfsOutputFormat.LOG.isDebugEnabled()) {
        de.zib.sfs.analysis.io.SfsOutputFormat.LOG.debug("Opening output for task {} / {}.", taskNumber, numTasks);
    }
    this.taskNumber = taskNumber;
}