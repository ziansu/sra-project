public static void main(java.lang.String[] args) {
    SpMap.insertSP(1, java.lang.Thread.currentThread().hashCode());
    java.lang.Thread.currentThread().setName("OneThreadDemo");
    java.lang.Thread t = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            java.lang.System.out.println("Test Anonymous Thread.");
        }
    };
    t.start();
    OneThreadDemo demo = new OneThreadDemo();
    demo.startThread();
}