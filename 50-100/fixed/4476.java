public void read(java.net.URL url, ika.geoimport.DataReceiver mapDataReceiver) throws java.io.IOException {
    if ((this.progressIndicator) != null)
        this.progressIndicator.start();
    
    this.threadParams.url = url;
    this.threadParams.dataReceiver = mapDataReceiver;
    read();
}