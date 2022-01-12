public void execute() {
    context.getSession().execute(atomicBatch);
}