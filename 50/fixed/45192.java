@java.lang.Override
public java.lang.Integer call() throws java.lang.Exception {
    return getProgramRuns(wordcountFlow1, ProgramRunStatus.RUNNING).size();
}