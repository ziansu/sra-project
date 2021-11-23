public void onFailure(java.lang.Throwable t) {
    finished.countDown();
    failures.add(t);
}