public void recieve_File(java.lang.String f) throws java.lang.Exception {
    java.lang.System.out.println("recieve File");
    FTPClient ftpclient = new FTPClient(IP, ((PORT) + 1000), CARD, PSW_CARD);
    ftpclient.Connect_Data_Channel();
    ftpclient.Reciev_file(f);
    java.lang.System.out.println(("transmit File : " + f));
    ftpclient.close();
}