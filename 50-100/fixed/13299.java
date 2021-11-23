public static void main(java.lang.String[] args) throws java.lang.Exception {
    SerialTest main = new SerialTest();
    main.initialize();
    java.lang.Thread t = new java.lang.Thread() {
        public void run() {
            try {
                java.lang.Thread.sleep(1000000);
            } catch (java.lang.InterruptedException ie) {
            }
        }
    };
    t.start();
    java.lang.System.out.println("Started");
}