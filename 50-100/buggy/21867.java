public void run() {
    int distance;
    while (true) {
        us.fetchSample(usData, 0);
        distance = ((int) ((usData[0]) * 100.0));
        cont.processUSData(distance);
        try {
            java.lang.Thread.sleep(50);
        } catch (java.lang.Exception e) {
        }
    } 
}