public void onMessage(byte[] message) {
    java.lang.System.out.println(new java.lang.String(message));
    count.addAndGet(1);
}