private void flush() {
    session.execute(batch);
    batch.clear();
}