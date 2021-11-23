public java.lang.String getResult(long jobNumber) throws java.lang.Exception {
    java.lang.Thread t2 = new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            try {
                java.lang.String result = out.get(jobNumber);
                cypherText = result;
                java.lang.System.out.println(cypherText);
            } catch (java.lang.Exception e) {
                java.lang.System.out.println(e);
            }
        }
    });
    t2.start();
    t2.join();
    out.remove(jobNumber);
    handler.removeRequest(jobNumber);
    return cypherText;
}