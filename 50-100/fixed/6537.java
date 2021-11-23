public java.lang.Thread run() {
    java.lang.Thread t1 = new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            try {
                java.lang.System.out.println("Starting...");
                t.Run();
            } catch (java.lang.Exception e1) {
                java.lang.System.out.println(("exception in run try catch block: " + e1));
                e1.printStackTrace();
            }
        }
    });
    return t1;
}