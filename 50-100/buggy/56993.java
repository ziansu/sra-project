private void processQueue() {
    while (((maxConcurrent) > (inProcess.size())) && (!(queue.isEmpty()))) {
        org.threadly.litesockets.protocol.http.HTTPClient.HTTPRequestWrapper hrw = queue.poll();
        inProcess.add(hrw);
        ssi.execute(new org.threadly.litesockets.protocol.http.HTTPClient.RunClient(hrw));
    } 
}