public void getPercentile(java.lang.Double percentile) {
    try {
        outStream.writeObject("get");
        outStream.writeObject(0.9);
        java.lang.System.out.println(inStream.readObject());
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(com.tdigestclient.TDigestClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (java.lang.ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(com.tdigestclient.TDigestClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}