public void produceQueue(int counter) {
    synchronized(queue.getQueueData()) {
        java.lang.String data = "item " + counter;
        java.lang.System.out.println(("Produced:" + data));
        queue.addData(data);
        try {
            java.lang.Thread.sleep(java.lang.Long.valueOf(1000));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}