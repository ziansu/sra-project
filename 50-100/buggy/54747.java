public void trans_File(java.lang.String f) throws java.lang.Exception {
    java.lang.System.out.println("transmit File");
    FTPClient ftpclient = new FTPClient(IP, ((PORT) + 1000), CARD, PSW_CARD);
    ftpclient.Connect_Data_Channel();
    ftpclient.Trans_file(f);
    java.lang.System.out.println(("transmit File : " + f));
    ezprivacy.toolkit.EZCardLoader.saveEnhancedProfile(profile, CL_CARD, PSW_CARD);
    ftpclient.close();
    return ;
}