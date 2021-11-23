public void onFailure(java.lang.Throwable t) {
    failures.add(t);
    finished.countDown();
}