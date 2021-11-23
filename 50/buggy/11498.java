public void execute() {
    context.getSession().execute(atomicBatch.setConsistencyLevel(writeCL));
}