private void removeEntryMNS(java.lang.String mrn) throws java.io.IOException, java.net.UnknownHostException {
    java.net.Socket MNSSocket = new java.net.Socket("localhost", 1004);
    java.io.BufferedWriter outToMNS = new java.io.BufferedWriter(new java.io.OutputStreamWriter(MNSSocket.getOutputStream(), java.nio.charset.Charset.forName("UTF-8")));
    if (kr.ac.kaist.mms_server.MMSConfiguration.LOGGING)
        java.lang.System.out.println(("Remove-Entry:" + mrn));
    
    outToMNS.write(("Remove-Entry:" + mrn));
    outToMNS.flush();
    outToMNS.close();
    MNSSocket.close();
    return ;
}