public void onMessage(java.lang.Object message) {
    java.lang.System.out.println(message);
    count.addAndGet(1);
}