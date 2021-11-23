@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    return (getProgramRuns(program, status).size()) > expected;
}