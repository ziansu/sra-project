public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    java.lang.String id = args[0];
    hw2.client.Lock lock = new hw2.client.Lock("string", id) {
        @java.lang.Override
        protected void onLockReceived() {
            java.lang.System.out.println("i am in the critical section");
        }
    };
    lock.start();
}