private void threadPause() {
    java.lang.Thread thread1 = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                thread.join(6000);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    if (!(thread1.isAlive())) {
        thread1.start();
    }else {
        try {
            thread1.join(6000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}