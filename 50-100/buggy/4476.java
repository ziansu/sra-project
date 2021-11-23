public void read(java.net.URL url, ika.geoimport.DataReceiver mapDataReceiver, boolean newOrSameThread) {
    if ((this.progressIndicator) != null)
        this.progressIndicator.start();
    
    this.threadParams.url = url;
    this.threadParams.dataReceiver = mapDataReceiver;
    if (newOrSameThread == (ika.geoimport.GeoImporter.NEW_THREAD))
        this.start();
    else
        this.run();
    
}