private void processQueue() {
    while (((maxConcurrent) > (inProcess.size())) && (!(queue.isEmpty()))) {
        org.threadly.litesockets.protocol.http.HTTPClient.HTTPRequestWrapper hrw = queue.poll();
        if (hrw != null) {
            inProcess.add(hrw);
            ssi.execute(new org.threadly.litesockets.protocol.http.HTTPClient.RunClient(hrw));
        }
    } 
}